import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        System.out.printf("Enter the triangle's legs" + "\n" + "a: ");
        double a = userInput();
        System.out.printf("b: ");
        double b = userInput();
        calculateTriangle(a, b);
    }

    public static double userInput() {
        Scanner scanner = new Scanner(System.in);
        double num = 0;
        try {
            num = scanner.nextDouble();
            if(num < 0){
                System.out.println("The number must be positive. Try once more.");
                num = userInput();
            }
        } catch (Exception ex) {
            System.out.println("You enter invalid data! Try again");
            num = userInput();
        }
        return num;
    }

    public static void calculateTriangle(double a, double b){
        double degreesA = Math.toDegrees(Math.atan(a / b));
        double degreesB = 180 - 90 - degreesA;
        double degreesC = 180 - degreesA - degreesB;
        
        System.out.println("Angle A = " + degreesA);
        System.out.println("Angle B = " + degreesB);
        System.out.println("Angle C = " + degreesC);
    }
}