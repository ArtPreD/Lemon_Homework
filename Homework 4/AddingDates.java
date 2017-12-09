import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddingDates {

    public static void main(String[] args) throws Exception {
        System.out.println("Enter date like DD.MM.YYYY: ");

        int dateSum = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String date = reader.readLine();

        Pattern p = Pattern.compile("[0-9.]+");
        Matcher m = p.matcher(date);
        if (!m.matches()){
            System.out.println("Number contains letter or special characters. Try again.");
        }

        date = date.replace(".", " ");
        String[] number = date.split(" ");

        for (String num : number) {
            dateSum += additionNumber(Integer.parseInt(num));
        }

        if (String.valueOf(dateSum).length() != 1){
            dateSum = additionNumber(dateSum);
        }
        System.out.println(dateSum);

    }

    public static boolean isOneNumber(String num){
        if (num.length() == 1){
            return true;
        }return false;
    }

    public static int additionNumber(int n){
        int dateSum = 0;
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        dateSum += sum;
        if (!isOneNumber(String.valueOf(dateSum))){
            dateSum = additionNumber(dateSum);
        }
        return dateSum;
    }
}
