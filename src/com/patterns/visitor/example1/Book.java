package com.patterns.visitor.example1;

public interface Book {
    void accept(Visitor v);
}