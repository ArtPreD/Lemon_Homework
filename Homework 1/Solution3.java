import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        System.out.println("Enter real number with nonzero fractional part:");
        round(userInput());
    }

    public static double userInput() {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        try {
            num = scanner.nextDouble();
            if(num % 1 == 0){
                System.out.println("Enter real number with !NONZERO! fractional part:");
                num = userInput();
            }
        } catch (Exception ex) {
            System.out.println("You enter invalid data! Try again");
            num = userInput();
        }

        return num;
    }

    public static void round(double num){
        double rounded = (num + 0.5) - ((num + 0.5) % 1);
        System.out.println("Round!" + "\n" + (int)rounded + "\n" + "Try again!");
            round(userInput());
    }
}