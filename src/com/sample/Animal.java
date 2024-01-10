package com.sample;

abstract public class Animal {  // abstract class
    int noOfLegs;
    int age;
    int horns;
    int tail;
    void sleep(){  //concrete method
        System.out.println("Sleeping with closed eyes");
    }
abstract void eat();  //abstract method
}
