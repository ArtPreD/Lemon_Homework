import java.util.Scanner;

public class DeleteSymbol {

    public static void main(String[] args) {
        System.out.println("Выберите способ удаления символа: " + "\n" + "(Примечание: пробелы, точки и запятые тоже являются символами)");
        System.out.println("1 - удалить символ из всей сроки, 2 - удалить символ в конкретном месте.");
        int var = userInputInt();
        String str = "";
        String letter = "";
        int index = 0;
        switch (var){
            case 1:
                System.out.printf("Введите строку: ");
                str = userInputString();
                System.out.printf("Введите символ: ");
                letter = userInputString();
                System.out.println("Символы удалены. Результат работы программы: " + "\n" + deleteAll(str, letter));
                break;

            case 2:
                System.out.printf("Введите строку: ");
                str = userInputString();
                System.out.printf("Введите позицию символа: ");
                index = userInputInt();
                System.out.println("Символ удален. Результат работы программы: " + "\n" + deleteSymbol(str, index));
                break;

            default:
                System.out.println("Выбор не определен. Завершаю работу программы");
        }

    }

    private static String deleteAll(String str, String letter){
        String origin = str;
        if (letter.length() != 1){
            System.out.printf("Это не один символ. Введите, пожалуйста, один символ: ");
            letter = userInputString();
            deleteAll(str, letter);
        }
        if (!str.contains(letter)){
            System.out.printf("Такого символа в строке нет. Повторите попытку: ");
            letter = userInputString();
            deleteAll(str, letter);
        }

        origin = origin.replaceAll(letter.toLowerCase(), "").replaceAll(letter.toUpperCase(), "");

        return origin;
    }

    private static String deleteSymbol(String str, int i) {
        String result = "";
        if (i > str.length()) {
            System.out.println("Число больше, чем длинна строки. Введите позицию еще раз. Длинна строки: " + str.length());
            System.out.printf("Введите позицию символа: ");
            i = userInputInt();
            result = deleteSymbol(str, i);
        }else {
            result = str.substring(0, i - 1) + str.substring(i);
        }

        return result;
    }

    private static String userInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int userInputInt(){
        Scanner scanner = new Scanner(System.in);
        try {
            return scanner.nextInt();
        } catch (Exception ex) {
            System.out.printf("Ошибка ввода данных. Введено не число! Попробуйте снова: ");
            return userInputInt();
        }
    }
}