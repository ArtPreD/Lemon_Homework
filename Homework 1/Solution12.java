import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Solution12 {
    public static void main(String[] args) {
        System.out.println("Enter distance and time (in hours) to get to point." + "\n" + "Distance:");
        int d = Integer.parseInt(userInput());
        System.out.println("Time (in hour): ");
        float t = Float.parseFloat(userInput());
        System.out.println("Your velocity must be " + calculateVelocity(d, t) + " km/h.");

    }

    public static String userInput(){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String numbers = "";
        try {
            numbers = read.readLine();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        Pattern p = Pattern.compile("[0-9.]+");
        Matcher m = p.matcher(numbers);
        if (!m.matches()){
            System.out.println("Numbers contains letter or special characters. Try again.");
            numbers = userInput();
        }
        return numbers;
    }

    public static int calculateVelocity(int d, float t){
        return Math.round(d / t);
    }
}
