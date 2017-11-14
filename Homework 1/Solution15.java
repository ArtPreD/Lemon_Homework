import java.util.Scanner;

public class Solution15 {

    public static void main(String[] args) {
        System.out.println("Enter the triangle's legs" + "\n" + "a: ");
        float a = userInput();
        System.out.println("b: ");
        float b = userInput();
        calculateTriangle(a, b);
    }

    public static float userInput() {
        Scanner scanner = new Scanner(System.in);
        float num = 0;
        try {
            num = scanner.nextFloat();
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

    public static void calculateTriangle(float a, float b){
        float s = (a * b) / 2;
        float hypotenuse = (float) Math.sqrt(Math.pow(a, 2) + Math.sqrt(Math.pow(b, 2)));
        float p = a + b + hypotenuse;

        System.out.println("Square equals: " + s);
        System.out.println("Perimeter equals: " + p);
        System.out.println("Hypotenuse equals: " + hypotenuse);
    }
}
