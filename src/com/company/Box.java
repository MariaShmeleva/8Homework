package com.company;

public class Box <T>{
    private T element;

    public T get() {
        return element;
    }

    public void put(T element) {
        this.element = element;
    }
}
