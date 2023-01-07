package com.patterns.visitor.example2;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Computer driver.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse driver.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard driver.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor driver.");
    }
}