import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println("Enter q: ");
        int q = userInput();
        System.out.println("Enter w: ");
        int w = userInput();
        System.out.println(q + "/" + w + " = " + (q / w) + " and " + (q % w) + " in the remnant");
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
}
