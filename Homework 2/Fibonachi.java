import java.util.ArrayList;

public class Fibonachi {

    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
        System.out.println("Числа Фибоначчи через рекурсивный метод с использованием ArrayList:");
    fibonachiArr(list, 20).forEach(n -> System.out.print(n + " "));
        System.out.println("\n" + "\n" + "Числа Фибоначчи через рекурсивный метод:");
        fibonachiRec(0, 1, 20);
    }

    private static ArrayList<String> fibonachiArr(ArrayList list, int count){
        if (list.isEmpty() && list.size() == 0){
            list.add("0");
            list.add("1");
            count -= 2;
        }
        String a = list.get(list.size() -1).toString();
        String b = list.get(list.size() - 2).toString();
        String c = String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
        list.add(c);
        count--;
        if (count > 0){
            fibonachiArr(list, count);
        }
        return list;
    }

    private static void fibonachiRec(int a, int b, int count){
        if (a == 0){
            System.out.print(a + " ");
            System.out.print(b + " ");
            count -=2;
        }
        System.out.print(a + b + " ");
        int c = a + b;
        count--;
        if (count > 0) {
           fibonachiRec(b, c, count);
        }
    }
}