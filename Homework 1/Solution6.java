import java.util.Arrays;
import java.util.Scanner;

public class Solution6 {

    public static void main(String[] args) {
        float[] numbers = {rand(), rand(), rand(), rand(), rand()};
        System.out.println("You have array " + Arrays.toString(numbers) + "\n" + "Select index (1-5) to increase number by 10%");
        increaseNumber(numbers, userInput());
    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        try {
            index = scanner.nextInt();
            if (index < 0){
                System.out.println("Enter positive number, please.");
                index = userInput();
            }if (index > 5){
                System.out.println("Please, enter index from 1 to 5.");
                index = userInput();
            }
        }catch (Exception ex){
            System.out.println("You enter invalid data! Try again");
            index = userInput();
        }

        return index;
    }

    public static void increaseNumber(float[] array, int index){
        if (index != 0) {
            array[index - 1] += array[index - 1] * 0.1;
            System.out.println("Increase! " + "\n" + Arrays.toString(array) + "\n" + "Select one more!");
            increaseNumber(array, userInput());
        }else {
            System.out.println("Bye-bye :)");
        }
    }

    public static float rand(){
        return (float) Math.round(Math.random()*10);
    }

}
