import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.print("The grades are: ");
        print(grades);
        System.out.println("The average is: " + average(grades));
        System.out.println("The median is: " + median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.println("The standard deviation is: " + stdDev(grades));

    }

    public static void readGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = in.nextInt();
        grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            int grade = in.nextInt();
            if (grade >= 0 && grade <= 100) {
                grades[i] = grade;
            } else {
                System.out.println("Lam lai");
            }
        }
        in.close();
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static double average(int[] array) {
        if (grades.length == 0) {
            return 0;
        } else {
            double sum = 0;
            for (int i = 0; i < grades.length; i++) {
                sum = sum + grades[i];
            }
            return sum / grades.length;
        }
    }

    public static double median(int[] array) {
        Arrays.sort(grades);
        int mid = grades.length / 2;
        if (grades.length % 2 == 0) {
            double median = (grades[mid] + grades[mid - 1]) / (double) 2;
            return median;
        } else {
            return grades[mid];
        }
    }

    public static int max(int[] array) {
        int max = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if (max < grades[i]) {
                max = grades[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = grades[0];

        for (int i = 0; i < grades.length; i++) {
            if (min > grades[i]) {
                min = grades[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double average = average(grades);
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + Math.pow(grades[i] - average, 2);
        }
        double ans = Math.sqrt(sum / grades.length);
        return Math.round(ans * 100.0) / 100.0;
    }
}
