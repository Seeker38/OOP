package HW6.Ex1_1;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");
        BigInteger i3 = i1.add(i2);
        System.out.println(i3);
        System.out.println(i1.multiply(i3));
        System.out.println(i2.multiply(i3));
        
    }
}
