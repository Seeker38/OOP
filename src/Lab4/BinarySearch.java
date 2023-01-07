public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {0, 6, 3, 4, 7, 444, 1, 24, 10, 0};
        int[] temp = {};
        array = sort(array);

        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 24));
        System.out.println(binarySearch(array, 444));
        System.out.println(binarySearch(array, -1));
        System.out.println(binarySearch(temp, 1));

    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        int middleIdx = (fromIdx + toIdx) / 2;
        if (fromIdx > toIdx) {
            return false;
        }
        if (array[middleIdx] == key) {
            return true;
        }
        if (array[middleIdx] > key) {
            return binarySearch(array, key, fromIdx, middleIdx - 1);
        }
        return binarySearch(array, key, middleIdx + 1, toIdx);


    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }

    public static int[] sort(int[] array) {
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
        return array;
    }
}
