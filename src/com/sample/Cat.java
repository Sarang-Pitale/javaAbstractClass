package com.sample;

public class Cat extends Animal {
    int size;

    void jump() {
        System.out.println("jumping");
    }

    void eat() { //overriding abstract method
        System.out.println("eating veg and nongveg");
    }
}
