import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 98, 8, 32, 121, 32};
        int[] b = {};
        bubbleSort(b);
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

    public static void bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}