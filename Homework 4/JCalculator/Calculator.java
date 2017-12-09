public class Calculator {

   private static int memory = 0;

    public static int calculate(String str) {
        String[] s2 = str.split("\\D+");

        if (s2[0].equals("") && s2.length == 2) {
            if (str.contains("+")) {
                memory = memory + Integer.parseInt(s2[1]);
            }
            if (str.contains("-")) {
                memory = memory - Integer.parseInt(s2[1]);
            }
            if (str.contains("/")) {
                memory = memory / Integer.parseInt(s2[1]);
            }
            if (str.contains("*")) {
                memory = memory * Integer.parseInt(s2[1]);
            }
        }else if (s2.length == 2) {
            if (str.contains("+")) {
                memory = Integer.parseInt(s2[0]) + Integer.parseInt(s2[1]);
            }
            if (str.contains("-")) {
                memory = Integer.parseInt(s2[0]) - Integer.parseInt(s2[1]);
            }
            if (str.contains("/")) {
                memory = Integer.parseInt(s2[0]) / Integer.parseInt(s2[1]);
            }
            if (str.contains("*")) {
                memory = Integer.parseInt(s2[0]) * Integer.parseInt(s2[1]);
            }
        }else {
            System.out.println("Введены неверные данные. Сброс программы.");
            memory = 0;
        }
        return memory;
    }
}
