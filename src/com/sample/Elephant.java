package com.sample;

public class Elephant extends Animal {
    int trunk;
    int tail;
    void makeGroup(){
        System.out.println("In a group");
    }
    void eat(){ //overriding abstract method
        System.out.println("eating veg");
    }
}
