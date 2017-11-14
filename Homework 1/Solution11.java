import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution11 {

    public static void main(String[] args) {
        System.out.println("Enter positive integer: ");
        int num = userInput();
        printTable(num);


    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = scanner.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("The number that was entered is not an integer! Try again.");
            number = userInput();
        }
        if (number < 0){
            System.out.println("The entered number is negative. Try again!");
            number = userInput();
        }
        return number;
    }

    public static void printTable(int num){
        for (int i = 1; i < 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
