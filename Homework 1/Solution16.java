import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        System.out.println("Enter degrees Celsius: ");
        System.out.println(calculateDegrees(userInput()));
    }

    public static double userInput(){
        Scanner scanner = new Scanner(System.in);
        double number;
        try {
            number = scanner.nextDouble();
        }catch (InputMismatchException ex){
            System.out.println("The number that was entered is not an double! Try again.");
            number = userInput();
        }
        if (number < 0){
            System.out.println("The entered number is negative. Try again!");
            number = userInput();
        }
        return number;
    }

    public static float calculateDegrees(double d){
        return (float) (d * 1.8) + 32;
    }

}