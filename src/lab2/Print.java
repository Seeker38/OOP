
public class Print {
    public static void main(String[] agrs) {
        int[] a = {1, 2, 3, 4, 54};
        //int[] a = {};
        //int[] a = {1};
        print(a);

        double[] b = {1.0, 2.0, 4.0, 55.3};
        //double[] b = {55.3};
        //double[] b = {};
        print(b);

        float[] c = {100.43f, 90.43f, 100.43f, 100.43f};
        //float[] c = {100.43f };
        //float[] c = {};
        print(c);
    }

    public static void print(int[] args) {
        if (args.length != 0) {
            System.out.print("[");
            for (int i = 0; i < args.length - 1; i++) {
                System.out.print(args[i] + ", ");
            }
            System.out.print(args[args.length - 1] + "] ");
        } else {
            System.out.print("[ ]");
        }
    }

    public static void print(double[] args) {
        if (args.length != 0) {
            System.out.print("[");
            for (int i = 0; i < args.length - 1; i++) {
                System.out.print(args[i] + ", ");
            }
            System.out.print(args[args.length - 1] + "] ");
        } else {
            System.out.print("[ ]");
        }
    }

    public static void print(float[] args) {
        if (args.length != 0) {
            System.out.print("[");
            for (int i = 0; i < args.length - 1; i++) {
                System.out.print(args[i] + ", ");
            }
            System.out.print(args[args.length - 1] + "] ");
        } else {
            System.out.print("[ ]");
        }
    }

}
