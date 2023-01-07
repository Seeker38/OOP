package com.oop1.collections.mylist;

public interface MyList {
    void add(Object o);

    void remove(int index);

    void add(Object o, int index);

    Object get(int index);

    int size();
}
