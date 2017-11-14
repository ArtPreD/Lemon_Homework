import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution4 {
    public static void main(String[] args) {
        System.out.println("Enter three-digit number: ");
        int n = Integer.parseInt(userInput());
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        System.out.println("Answer is: " + sum);
    }

    public static String userInput(){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String number = "";
        try {
            number = read.readLine();
        }catch (Exception ex){
            System.out.println("You enter invalid data! Try again.");
            number = userInput();
        }
        if (number.contains(",") || number.contains(".")){
            System.out.println("This number should not be double! Try again.");
            number = userInput();
        }else if (number.length() != 3){
            System.out.println("This number is not three-digit! Try again.");
            number = userInput();
        }
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(number);
        if (!m.matches()){
            System.out.println("Number contains letter or special characters. Try again.");
            number = userInput();
        }
        return number;
    }
}