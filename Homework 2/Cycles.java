import java.util.Scanner;

public class Cycles {

    public static void main(String[] args) {
        System.out.println("Выберите цикл: 1 - цикл for, 2 - цикл while, 3 - цикл do while");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()){
            case 1:
                for(;;){
                    System.out.println("Это цик for");
                }
            case 2:
                while (true){
                    System.out.println("Это цикл while");
                }
            case 3:
                do {
                    System.out.println("Это цикл do while");
                }while (true);

                default:
                    System.out.println("Некорректный выбор. Завершаю программу");
        }
    }
}