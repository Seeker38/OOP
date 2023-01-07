package com.patterns.visitor.example2;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
