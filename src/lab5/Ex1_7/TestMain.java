package Ex1_7;

public class TestMain {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(1.1, 2.2);
        MyComplex complex2 = new MyComplex(3.3, 4.4);
        System.out.println("Number 1 is: " + complex1);
        System.out.println("Number 2 is: " + complex2);

        System.out.println("Real is: " + complex1.getReal());
        System.out.println("Img is: " + complex1.getImag());
        complex1.setReal(5.5);
        System.out.println("Real is: " + complex1.getReal());
        complex1.setImag(6.6);
        System.out.println("Img is: " + complex1.getImag());
        complex1.setValue(1.1, 2.2);
        System.out.println("Number 1 is: " + complex1);

        System.out.println(complex1.magnitude());

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

        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equal to " + complex2);
        } else {
            System.out.println(complex1 + " is NOT equal to " + complex2);
        }

        System.out.println(complex1.add(complex2));
        System.out.println(complex1.addNew(complex2));
        System.out.println(complex1.subtract(complex2));
        System.out.println(complex1.subtractNew(complex2));
        System.out.println(complex1.argument());
        System.out.println(complex1.multiply(complex2));
        System.out.println(complex1.divide(complex2));
        System.out.println(complex1.conjugate());
    }
}
