public class Reverse {
    public static void main(String[] args) {
        int[] a = {12, 2, 2, 4, 2};
        //int[] a = {};
        //int[] a = {12};
        reverse(a);

    }

    public static void reverse(int[] array) {
        int[] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[array.length - i - 1];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
