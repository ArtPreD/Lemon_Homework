import java.util.Scanner;

public class SymbolTest {

    public static void main(String[] args) {
        System.out.printf("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for ( int i = 0; i < num; i++ ) {
            char c = (char)(Math.random()*26 + 'a');
            System.out.print(c + ": ");
            switch ( c ) {
                case 'a': case 'e': case 'i':
                case 'o': case 'u':
                    System.out.println("гласная");
                    break;
                case 'y': case 'w':
                    System.out.println("иногда гласная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }
    }
}