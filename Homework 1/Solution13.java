import java.util.Scanner;

public class Solution13 {

    public static void main(String[] args) {
        System.out.println("How many days need calculate in seconds?");
        calculateSeconds(userInput());
    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        try {
            day = scanner.nextInt();
        }catch (Exception ex){
            System.out.println("You enter invalid data! Try again");
            day = userInput();
        }

        return day;
    }

    public static void calculateSeconds(int day) {
        long seconds = day * 24 * 60 * 60;
        String d = " day";
        if (day > 0) {
            if (day != 1) {
                d += "s";
            }
            System.out.println("In " + day + d + " " + seconds + " seconds.");
        }else {
            System.out.println("You enter negative number! I don't calculate this!!1");
        }
    }

}
