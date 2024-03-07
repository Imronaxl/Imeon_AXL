import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array1 = ArrayProvider(10, 5); // Исправлено на верное название метода
//        quickSort(array1);
//        printArray(array1);
       // ProvideTime(1000000, 5000);
        String a = "Abcda";
        a += "BASD";
        System.out.println(a);
    }

    public static int[] ArrayProvider(int n, int k){ // Исправлено на верное имя метода
        int[] arr = new int[n]; // Исправлено
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(k);
        }
        return arr;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) { // Исправлено
            System.out.print(array[i]);
            System.out.print(' ');

        }
    }
    public static void quickSort(int[] arr) {
        Arrays.sort(arr);
    }
    public static void ProvideTime(int n, int k) {
        long time1 = System.currentTimeMillis();
        int arr[] = ArrayProvider(n, k);
        long time2 = System.currentTimeMillis();
        System.out.println("Time which spent " +  (time2 - time1));
    }
}
