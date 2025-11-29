package com.rcta.handson.strategy.goodcode;

public class Dog extends Animal {

    public Dog(){
        super();
        flyType = new CantFly();
        setSound("Bark");
    }

    public void digHole(){
        System.out.println("A dog will dug a hole");
    }


//    public String fly() {
//        return "Cant fly";
//    }
}
