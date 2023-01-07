public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 54, 4, 0};
        int[] temp = {};
        System.out.println(linearSearch(array, 2));
        System.out.println(linearSearch(array, 9));
        System.out.println(linearSearchIndex(array, 3));
        System.out.println(linearSearchIndex(array, 9));
        System.out.println(linearSearch(temp, 9));

    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
