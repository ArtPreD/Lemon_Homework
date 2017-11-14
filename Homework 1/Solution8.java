import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution8 {
    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int num = userInput();
        System.out.println(isEvenNumber(num));
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

    public static String isEvenNumber(int number){
        String isEven = "";
        if ((number % 2) == 0){
            isEven = "Number " + number + " is even.";
        }else isEven = "Number " + number + " is odd.";
        return isEven;
    }
}