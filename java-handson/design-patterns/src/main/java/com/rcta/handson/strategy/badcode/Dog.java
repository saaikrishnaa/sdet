package com.rcta.handson.strategy.badcode;

public class Dog extends Animal{

    public Dog(){
        super();
    }

    public void digHole(){
        System.out.println("A dog will dug a hole");
    }


    public String fly() {
        return "Cant fly";
    }
}
