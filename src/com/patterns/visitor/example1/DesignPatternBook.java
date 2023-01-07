package com.patterns.visitor.example1;


public class DesignPatternBook implements ProgramingBook {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "search google";
    }

    public String getBestSeller() {
        return "OOP";
    }
}