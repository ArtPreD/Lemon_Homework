import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution5 {
    public static void main(String[] args) {
        System.out.println("Enter your weight: ");
        int weight = userInput();
        System.out.println("You weight on the moon: ~" + calculateWeight(weight) + " kilograms.");
    }

    public static int userInput(){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        try {
            number = Integer.parseInt(read.readLine());
        }catch (Exception ex){
            System.out.println("You enter invalid data! Try again.");
            number = userInput();
        }
        return number;
    }

    public static float calculateWeight(int weight){
        return weight * 0.17f;
    }
}
