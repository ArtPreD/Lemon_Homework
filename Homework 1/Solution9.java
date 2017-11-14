import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        System.out.println("Enter double number: ");
        isInteger(userInput());

    }

    public static double userInput() {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        try {
            num = scanner.nextDouble();
        } catch (Exception ex) {
            System.out.println("You enter invalid data! Try again");
            num = userInput();
        }
        return num;
    }

    public static void isInteger(double num){
        if (num % 1 == 0){
            System.out.println("This number is an integer, try again.");
        }else {
            System.out.println("This number is double, try again");
        }
        isInteger(userInput());
    }
}
