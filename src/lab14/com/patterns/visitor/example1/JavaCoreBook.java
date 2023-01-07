package com.patterns.visitor.example1;

public class JavaCoreBook implements ProgramingBook {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "go to google search";
    }

    public String getFavouriteBook() {
        return "introduction of java";
    }
}