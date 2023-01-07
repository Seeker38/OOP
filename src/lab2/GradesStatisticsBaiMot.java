import java.util.Scanner;

public class GradesStatisticsBaiMot {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = in.nextInt();
        int[] grades = new int[n];
        int num = 1;

        if (grades.length > 0) {
            for (int i = 0; i < grades.length; i++) {
                System.out.print("Enter the grade for student " + num + ": ");
                grades[i] = in.nextInt();
                num++;
            }

            int sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum = sum + grades[i];
            }
            double average = sum / (double) grades.length;
            System.out.println("The average is: " + Math.round(average * 100.0) / 100.0);

            int min = grades[1];
            for (int i = 0; i < grades.length; i++) {
                if (min > grades[i]) {
                    min = grades[i];
                }
            }
            System.out.println("The minimum is: " + min);

            int max = grades[0];
            for (int i = 0; i < grades.length; i++) {
                if (max < grades[i]) {
                    max = grades[i];
                }
            }
            System.out.println("The maximum is: " + max);


        } else {
            System.out.println("lam lai");
        }
    }
}
