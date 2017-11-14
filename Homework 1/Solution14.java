public class Solution14 {

    public static void main(String[] args) {
        if (args != null && args.length == 2) {
            System.out.println("You will get " + (Math.round(Integer.parseInt(args[0]) / Double.parseDouble(args[1]))) + "USD" +
                    " for " + args[0] + "UAH");
        }else {
            System.out.println("You need enter arguments! First - amount of money, second - exchange rate.");
        }
    }
}