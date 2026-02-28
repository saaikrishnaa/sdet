package com.rcta.handson.designpatterns.strategy.goodcode;

public class Bird extends Animal {

    public Bird(){

        super();
        setFavFood("Seeds");
        flyType = new CanFly();
    }

//    public String fly(){
//        return "Can fly high"; //This is a duplicate method that already exist in Animal class
//    }
}
