import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println("Enter numbers separated by commas." + "\n" + "Example: " +
        Math.round(Math.random()*10)+ "," + Math.round(Math.random()*10) + "," + Math.round(Math.random()*10));
        String numbers = userInput();
        greaterNumber(numbers);


    }

    public static String userInput(){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String numbers = "";
        try {
            numbers = read.readLine();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        Pattern p = Pattern.compile("[0-9,-]+");
        Matcher m = p.matcher(numbers);
        if (!m.matches()){
            System.out.println("Numbers contains letter or special characters. Try again.");
            numbers = userInput();
        }
        return numbers;
    }

    public static void greaterNumber(String numbers){
        String[] subStr;
        String delimiter = ",";
        subStr = numbers.split(delimiter);
        int max = Integer.parseInt(subStr[0]);
        int min = Integer.parseInt(subStr[0]);

        for (String num : subStr){
            if(max < Integer.parseInt(num)){
                max = Integer.parseInt(num);
            }
            if (min > Integer.parseInt(num)){
                min = Integer.parseInt(num);
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
