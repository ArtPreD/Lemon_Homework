import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] numbers = createArray();
        //int[] numbers = {2,1,3,6,5,9,8};
        System.out.println("You have array " + Arrays.toString(numbers));
        bubbleSort(numbers);
        selectionSort(numbers);
        insertSort(numbers);
    }

    public static void bubbleSort(int[] numbers){
        long start = System.currentTimeMillis();
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("Затрачено милисек. на сортировку пузырьком: " + (System.currentTimeMillis() - start));
        System.out.println(Arrays.toString(numbers));
    }

    public static void selectionSort (int[] numbers){
        int min, temp;
        long start = System.currentTimeMillis();
        for (int i = 0; i < numbers.length-1; i++){
            min = i;
            for (int j = i+1; j < numbers.length; j++){
                if (numbers[j] < numbers[min])
                    min = j;
            }

            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;
        }
        System.out.println("Затрачено милисек. на сортировку выбором: " + (System.currentTimeMillis() - start));
        System.out.println(Arrays.toString(numbers));
    }

    public static void insertSort(int[] numbers) {
        int temp, j;
        long start = System.currentTimeMillis();
        for(int i = 2; i < numbers.length; i++){
                temp = numbers[i];
                j = i - 1;
                while (j > 0 && numbers[i] > temp){
                    numbers[j + 1] = numbers[j];
                    j--;
                }
                numbers[j + 1] = temp;

            }

        System.out.println("Затрчено милисек. на сортировку вставкой: " + (System.currentTimeMillis() - start));
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] createArray(){
        int[] array = new int[500];
        for (int i = 0; i < array.length; i++){
            array[i] = (int) Math.round(Math.random()*100);
        }

        return array;
    }
}