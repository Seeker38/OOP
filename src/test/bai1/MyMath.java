package test.bai1;

public class MyMath {
    public static double cos(double n){
        double accuracy = 0.0001, denominator, sinx, sinval;
        n = n * (double)(3.142 / 180.0);
        double x1 = n;
        sinx = n;
        sinval = (double)Math.sin(n);
        int i = 1;
        do
        {
            denominator = 2 * i * (2 * i + 1);
            x1 = -x1 * n * n / denominator;
            sinx = sinx + x1;
            i = i + 1;
        } while (accuracy <= sinval - sinx);
        return sinx;
    }

    public String decimalTo(String number, int outRadix){
        return "";
    }
    public static double exp(double power){

        double base = Math.E;

        int decimal = (int)power;
        double frac = power - decimal;

        double result = 1;
        while (decimal != 0) {
            result = result * base;
            decimal--;
        }
        if (frac != 0){
            return result += Math.pow(result,frac);
        }
        return result;
    }




    private final static String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

    private int toInt(String in, int inRadix)
    {
        int result = 0;
        for(int i = in.length()-1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length()-1 - i));
        }
        return result;
    }

    public static String toRadix(int number, int radix)
    {
        String result = "";
        if (radix == 0) {
            return result;
        }

        while (number > 0) {
            result = alphabet.charAt(number%radix) + result;
            number /= radix;
        }
        return result;
    }

    private String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toInt(in, inRadix), outRadix);
    }



    public static void main(String[] args) {
        System.out.println(exp(2.2) * cos(3.3));
        System.out.println(Math.exp(2.2) * Math.cos(3.3));
        
    }
}
