
public class ArrayToString {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        //int[] a = {};
        //int[] a = {1};
        arrayToString(a);
    }

    public static void arrayToString(int[] array) {
        String[] b = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            b[i] = String.valueOf(array[i]);
        }
        if (array.length != 0) {
            System.out.print("[");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.print(array[array.length - 1] + "] ");
        } else {
            System.out.print("[ ]");
        }
    }
}
