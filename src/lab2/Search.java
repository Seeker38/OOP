public class Search {
    public static void main(String[] args) {
        int[] a = {12, 2, 2, 4, 2};
        //int[] a = {};
        //int[] a = {12};
        int key = 2;
        int temp =search(a,key);


        if (temp != -1) {

            int ans = temp;
            int n = a.length-ans-1;
            while (n > 0 && ans != -1) {
                System.out.println(ans);
                int[] b = new int[n];
                ans = search(b, key);
                n = n - ans - 1;
            }
        }   else
                System.out.println(-1);

    }
    public static int search(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
