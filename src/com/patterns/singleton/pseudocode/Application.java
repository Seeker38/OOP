package com.patterns.singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT name FROM CSDL");
        foo.query("SELECT * FROM CSDL WHERE name like 'ha'");
        Database bar = Database.getInstance();
        bar.query("SELECT name FROM CSDL");
        bar.query("SELECT name FROM CSDL WHERE name like 'ha'");

        System.out.println(foo == bar);

    }
}
