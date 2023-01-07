public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {1, 2, 324, 53, 43, 0, 9};
        int[] b ={};
        selectionSort(a);
        System.out.println();
        selectionSort(b);
    }

    public static void selectionSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
