import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calc {

    static int memory = 0;
    static String s1 ="";

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор. Для начала работы введите \"1\", для получения инструкции - \"2\"." + "\n" +
        "Для выхода - \"00\" ");
        System.out.printf("Ваш вариант: ");
        s1 = userInput();
        switch (s1){

            case "1":
                start();
                break;

            case "2":
                System.out.println("Если будет введено, например, \"2 + 2\" - в ответ получите \"4\" и результат будет записан в память." + "\n" +
                "Далее можно передавать \" + 3\", например, чтобы дедить\\умножать\\плюсовать\\вычитать из числа в памяти." + "\n" +
                "Если программе будет передан пример вида \"2 + 2\" - память будет очищена и вы получите новый ответ.");
                start();
                break;

            case "00":
                System.out.println("Завершаю программу");
                break;

            default:
                System.out.println("Введен недопустимый вариант. Завершаю программу.");
        }
    }


    public static void start(){
        System.out.printf("Введите действие: ");
        while (true) {
            s1 = userInput();
            if (!s1.equals("00")) {
                System.out.println("Ответ: " + calculate(s1));
            }else {
                break;
            }
        }
        System.out.println("Завершаю программу.");
    }

    public static int calculate(String str) {
        String[] s2 = str.split("\\D+");

        if (s2[0].equals("") && s2.length == 2) {
            if (str.contains("+")) {
                memory = memory + Integer.parseInt(s2[1]);
            }
            if (str.contains("-")) {
                memory = memory - Integer.parseInt(s2[1]);
            }
            if (str.contains("/")) {
                memory = memory / Integer.parseInt(s2[1]);
            }
            if (str.contains("*")) {
                memory = memory * Integer.parseInt(s2[1]);
            }
        }else if (s2.length == 2) {
            if (str.contains("+")) {
                memory = Integer.parseInt(s2[0]) + Integer.parseInt(s2[1]);
            }
            if (str.contains("-")) {
                memory = Integer.parseInt(s2[0]) - Integer.parseInt(s2[1]);
            }
            if (str.contains("/")) {
                memory = Integer.parseInt(s2[0]) / Integer.parseInt(s2[1]);
            }
            if (str.contains("*")) {
                memory = Integer.parseInt(s2[0]) * Integer.parseInt(s2[1]);
            }
            }else {
            System.out.println("Введены неверные данные. Сброс программы.");
            memory = 0;
        }
        return memory;
    }

    public static String userInput() {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = read.readLine();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return str;
    }
}