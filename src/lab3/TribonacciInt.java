public class TribonacciInt {
    public static void main(String[] args) {
        tribonacciInt();
    }

    public static void tribonacciInt() {
        int i = 1, y = 3, x = 1, ans = 4;
        int temp = 2;
        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        System.out.println("F(2) = 2");
        while (true) {
            System.out.println("F(" + y + ") = " + ans);
            y++;
            i = x;
            ans += temp + x;
            x = temp;

            temp = ans - i - temp;
            if (Integer.MAX_VALUE - temp - x < i) {
                System.out.println("F(" + y + ") is out of the range int");
                break;
            }


        }
    }
}
