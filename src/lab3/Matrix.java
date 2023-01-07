import java.util.Scanner;

public class Matrix {
    public static double[][] createRandomMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (double) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public static int[][] createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix2.length == matrix1.length && matrix2[0].length == matrix1[0].length) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix2.length == matrix1.length && matrix2[0].length == matrix1[0].length) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] ans = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return ans;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] ans = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return ans;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] ans = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return ans;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] ans = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return ans;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] ans = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {

                ans[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    ans[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return ans;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] ans = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {

                ans[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    ans[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();

        int[][] matrix1 = new int[x][y];
        int[][] matrix2 = new int[x][y];
        double[][] matrix3 = new double[x][y];
        double[][] matrix4 = new double[x][y];

        matrix1 = createRandomMatrix(matrix1);
        matrix2 = createRandomMatrix(matrix2);
        matrix3 = createRandomMatrix(matrix3);
        matrix4 = createRandomMatrix(matrix4);

        System.out.println(" ma tran nguyen 1: ");
        print(matrix1);
        System.out.println(" ma tran nguyen 2: ");
        print(matrix2);
        System.out.println(" ma tran thuc 3: ");
        print(matrix3);
        System.out.println(" ma tran thuc 4: ");
        print(matrix4);

        if (haveSameDimension(matrix1, matrix2)) {
            System.out.println("Tong 2 ma tran: ");
            print(add(matrix1, matrix2));
            System.out.println("hieu 2 ma tran: ");
            print(subtract(matrix1, matrix2));
        }
        if (matrix1.length == matrix1[0].length) {
            System.out.println("tich ma tran 1 nhan ma tran 2:");
            print(multiply(matrix1, matrix2));
        } else {
            System.out.println("ma tran khong co tich ");
        }

        if (haveSameDimension(matrix3, matrix4)) {
            System.out.println("Tong 2 ma tran: ");
            print(add(matrix3, matrix4));
            System.out.println("hieu 2 ma tran: ");
            print(subtract(matrix3, matrix4));
        }
        if (matrix3[0].length == matrix3.length) {
            System.out.println("tich ma tran 1 nhan ma tran 2: ");
            print(multiply(matrix3, matrix4));
        } else {
            System.out.println("ma tran khong co tich ");
        }
    }
}
