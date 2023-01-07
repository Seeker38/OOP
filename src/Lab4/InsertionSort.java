import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        in.close();
        insertionSort(array);
        System.out.println(Arrays.toString(array));
//        int[] a = {1,3,43,2,5,76,42,0};
//        int[] b = {};
//        insertionSort(a);
//        insertionSort(b);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
