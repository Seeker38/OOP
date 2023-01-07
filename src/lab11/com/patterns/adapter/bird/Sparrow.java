package com.patterns.adapter.bird;

class Sparrow implements Bird {
    public void fly() {
        System.out.println("Fly");
    }

    public void makeSound() {
        System.out.println("Chip Chip");
    }
}
