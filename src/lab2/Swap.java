public class Swap {
    public static void main(String[] args) {
        int[] a = {12, 2, 2, 4, 2};
        //int[] a = {};
        //int[] a = {12};
        int[] b = {12, 2, 3, 6, 19};
        //int[] b = {};
        //int[] b = {13, 12 , 123};
        if (a.length == b.length) {
            System.out.println(swap(a, b));
        } else {
            System.out.println("false");
        }
    }

    public static boolean swap(int[] array1, int[] array2) {
        int[] a = new int[array1.length];
        boolean ans = false;

        for (int i = 0; i < array1.length; i++) {
            a[i] = array1[i];
        }
        int[] temp = array1;
        array1 = array2;
        array2 = temp;
        for (int i = 0; i < array1.length; i++) {
            if (a[i] != array2[i]) {
                ans = false;
                break;
            } else {
                ans = true;
            }
        }
        return ans;
    }
}
