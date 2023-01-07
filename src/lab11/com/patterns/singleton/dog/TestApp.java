package com.patterns.singleton.dog;

public class TestApp {
    public static void main(String[] args) {
        Dog dog1 = Dog.getInstance("Husky");
        System.out.println(dog1.getBreed());

        Dog dog2 = Dog.getInstance("chiba");
        System.out.println(dog2.getBreed());

        Dog dog3 = Dog.getInstance("Husky");
        System.out.println(dog3.getBreed());
    }
}
