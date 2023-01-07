package com.patterns.singleton.dog;

import java.util.HashMap;

public class Dog {
    private String breed;
    private static HashMap<String, Dog> map = new HashMap<>();

    private Dog(String breed) {
        this.breed = breed;
    }

    public static Dog getInstance(String breed) {
        if (!map.containsKey(breed)) {
            map.put(breed, new Dog(breed));
        }
        return map.get(breed);
    }

    public String getBreed() {
        return breed;
    }
}
