package com.company;

public class Singleton {

    private int value = 0;
    private Singleton() {}
    private static Singleton instance = null;
    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
