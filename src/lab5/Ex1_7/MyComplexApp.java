package Ex1_7;

import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = in.nextDouble();
        double img1 = in.nextDouble();

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = in.nextDouble();
        double img2 = in.nextDouble();

        MyComplex complex1 = new MyComplex(real1, img1);
        MyComplex complex2 = new MyComplex(real2, img2);

        System.out.println("Number 1 is: " + complex1);
        if (complex1.isReal()) {
            System.out.println(complex1 + " is a pure real number");
        } else {
            System.out.println(complex1 + " is NOT a pure real number");
        }
        if (complex1.isImaginary()) {
            System.out.println(complex1 + " is a pure imaginary number");
        } else {
            System.out.println(complex1 + " is NOT a pure imaginary number");
        }
        System.out.println("Number 2 is: " + complex2);
        if (complex2.isReal()) {
            System.out.println(complex1 + " is a pure real number");
        } else {
            System.out.println(complex1 + " is NOT a pure real number");
        }
        if (complex2.isImaginary()) {
            System.out.println(complex1 + " is a pure imaginary number");
        } else {
            System.out.println(complex1 + " is NOT a pure imaginary number");
        }

        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equal to " + complex2);
        } else {
            System.out.println(complex1 + " is NOT equal to " + complex2);
        }

        System.out.println(complex1 + " + " + complex2 + " = " + complex1.addNew(complex2));

    }
}
