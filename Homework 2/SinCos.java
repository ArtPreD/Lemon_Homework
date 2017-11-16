public class SinCos {

    public static void main(String[] args) {
        if(args.length != 0){
            System.out.println("You enter " + args[0] + " degrees");
            calculateSinCos(Double.parseDouble(args[0]));
        }else {
            System.out.println("Please, enter degrees as an argument when the program starts.");
        }
    }

    private static void calculateSinCos(double degrees){
        System.out.println("Sin = " + String.format("%(.5f", Math.toDegrees(Math.sin(Math.toRadians(degrees)))));
        System.out.println("Cos = " + String.format("%(.5f", Math.toDegrees(Math.cos(Math.toRadians(degrees)))));
    }
}