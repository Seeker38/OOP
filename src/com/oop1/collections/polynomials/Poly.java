package com.oop1.collections.polynomials;

public interface Poly {

    int degree();

    Poly derivative();

    double coefficient(int degree);

    double[] coefficients();
}
