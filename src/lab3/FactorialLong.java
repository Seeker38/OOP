public class FactorialLong {
    public static void main(String[] args) {
        factorial();
    }

    public static void factorial() {
        int i = 1, ans = 1;
        while (true) {
            System.out.printf("The factorial of %1$d is %2$d.\n", i, ans);
            if (Long.MAX_VALUE / ans < (i + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i + 1));
                break;
            }
            i++;
            ans *= i;
        }
    }
}
