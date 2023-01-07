package com.patterns.observer.demo;

public abstract class Observer {
    public Subject subject;

    public abstract void update();
}
