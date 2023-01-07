public class CopyOf {
    public static void main(String[] args) {
        int[] a = {12, 2, 2, 4, 2};
        //int[] a = {};
        //int[] a = {12};
        int n = 5;


        int[] copyOne = copyOf(a);
        int[] copyTwo = copyOf(a, n);
        
        for (int i = 0; i < copyOne.length; i++) {
            System.out.print(copyOne[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < copyTwo.length; i++) {
            System.out.print(copyTwo[i] + " ");
        }
    }

    public static int[] copyOf(int[] array, int newlength) {
        int[] newArr;
        if (newlength > 0) {
            newArr = new int[newlength];
            for (int i = 0; i < newArr.length; i++) {
                newArr[i] = array[i];
            }
            return newArr;
        } else {
            return null;
        }
    }

    public static int[] copyOf(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

}
