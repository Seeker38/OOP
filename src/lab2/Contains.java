public class Contains {
    public static void main(String[] args) {
        int[] a = {12, 2, 3, 4, 19};
        //int[] a = {};
        //int[] a = {12};
        int key = 2;

        if (contains(a, key)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
