import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.printf("Введите строку, что бы проверить является ли она палиндромом: ");
        Scanner scanner = new Scanner(System.in);
        isPalindrome(scanner.nextLine());
    }

    private static void isPalindrome(String str) {
       String origin = str.replaceAll(" ", "").toLowerCase();
       StringBuilder builder = new StringBuilder(origin);
       String reverse = builder.reverse().toString();
       System.out.println((origin.equals(reverse)) ? str + " - это палиндром!" : str + " - это не палиндром :(");
    }
}