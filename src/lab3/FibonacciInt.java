public class FibonacciInt {
    public static void main(String[] args) {
        fibonacciInt();
    }

    public static void fibonacciInt() {
        int i = 1, y = 2, ans = 2;
        int temp = 1;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        while (true) {
            System.out.println("F(" + y + ") = " + ans);
            y++;
            i = temp;
            ans += temp;
            temp = ans - temp;
            if (Integer.MAX_VALUE - temp < i) {
                System.out.println("F(" + y + ") is out of the range int");
                break;
            }


        }
    }
}
