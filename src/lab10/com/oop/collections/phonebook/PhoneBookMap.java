package com.oop.collections.phonebook;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    public void addPerson(Student s) {
        if (!phoneBook.containsKey(s.phone)) {
            phoneBook.put(s.phone, s);
        }
    }

    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student searchByLastName(String lastName) {
        for (Student student : phoneBook.values()) {
            if (student.lastName.equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.phone.equals(phone)) {
                return student;
            }
        }
        return null;
    }

    public void deleteByNumber(String phone) {
        phoneBook.remove(phone);
    }
}
