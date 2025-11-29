package com.rcta.handson.strategy.badcode;

public class Bird extends Animal{

    public Bird(){
        super();
    }

    public String fly(){
        return "Can fly high"; //This is a duplicate method that already exist in Animal class
    }
}
