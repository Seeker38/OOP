public class Equals {
    public static void main(String[] args) {
        int[] a = {12, 2, 2, 4, 2};
        //int[] a = {};
        //int[] a = {12};
        int[] b = {12, 2, 2, 4, 2};
        //int[] b = {};
        //int[] b = {13, 12 , 123};

        System.out.println(equals(a, b));

    }

    public static boolean equals(int[] array1, int[] array2) {
        boolean temp = false;
        if (array2.length == array1.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array2[i] != array1[i]) {
                    temp = false;
                    break;
                } else {
                    temp = true;
                }
            }
        }
        return temp;
    }
}
