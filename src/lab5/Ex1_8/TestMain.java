package Ex1_8;

public class TestMain {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial polynomial2 = new MyPolynomial(1.1, 2.2, 4.4);

        MyPolynomial polynomial3 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial polynomial4 = new MyPolynomial(coeffs);
        System.out.println(polynomial1);
        System.out.println(polynomial2);
        System.out.println(polynomial3);
        System.out.println(polynomial1.evaluate(5));
        System.out.println(polynomial1.add(polynomial2));
        System.out.println(polynomial1.multiply(polynomial2));
    }
}
