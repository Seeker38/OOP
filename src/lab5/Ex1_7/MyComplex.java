package Ex1_7;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + this.real + " + " + this.imag + "i)";
    }

    public boolean isReal() {
        if (this.imag == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (this.real == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }


    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    public MyComplex add(MyComplex right) {

        this.imag = this.imag + right.imag;
        this.real = this.real + right.real;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        double real = this.real + right.real;
        double imag = this.imag + right.imag;

        return new MyComplex(real, imag);
    }

    public MyComplex subtract(MyComplex right) {
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    public double argument() {
        return Math.atan2(this.real, this.imag);
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + this.imag * right.real;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double mauSo = Math.sqrt(right.real * right.real + right.imag * right.imag);
        this.real = this.multiply(right).getReal() / mauSo;
        this.imag = this.multiply(right).getImag() / mauSo;
        return this;
    }

    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }
}
