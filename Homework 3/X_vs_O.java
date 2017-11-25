import java.util.Scanner;

public class X_vs_O {

    public static void main(String[] args) {

        System.out.println("Добро пожаловать в игру \" X vs O \"! Выберите режим игры: ");
        System.out.println("Играть вдвоем --> 1");
        System.out.println("Играть с компьютером --> 2");
        System.out.print("Ваш выбор? ");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()){
            case 1:
                System.out.println("Вы выбрали режим игрок vs игрок!");
                GamePlayer gamePlayer = new GamePlayer();
                gamePlayer.start();
                break;
            case 2:
                System.out.println("Вы выбрали режим игрок vs комптютер!");
                GameComputer gameComputer = new GameComputer();
                gameComputer.start();
                break;
            default:
                System.out.println("Веденны неверные данные");
        }

    }
}
