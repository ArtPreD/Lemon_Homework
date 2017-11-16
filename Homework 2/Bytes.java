import java.util.Arrays;
import java.util.Scanner;

public class Bytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите любую строку: ");
        byteArrayToString(stringToByteArray(scanner.nextLine()));
    }

    public static byte[] stringToByteArray(String str){
        byte[] bytesArr = str.getBytes();
        System.out.println("Преобразуем строку в массив байтов: " + Arrays.toString(bytesArr));
        return bytesArr;
    }

    public static void byteArrayToString(byte[] byteArr){
        String str = new String(byteArr);
        System.out.println("А теперь назад!" + "\n" + str);
    }
}