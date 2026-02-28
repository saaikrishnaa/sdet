package com.rcta.handson.designpatterns.strategy.goodcode;

public class Runner {

    public static void main(String[] args) {
        Dog husky = new Dog();
        System.out.println("I am a dog -> "+husky.tryToFly());

        Bird tweety = new Bird();
        System.out.println("I am a bird -> "+tweety.tryToFly());

        husky.setFlyAbility(new CanFly());

        System.out.println("I am a dog, and i practiced a lot, and now -> "+husky.tryToFly());
    }
}
