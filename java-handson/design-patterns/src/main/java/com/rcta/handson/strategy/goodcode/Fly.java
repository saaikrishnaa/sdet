package com.rcta.handson.strategy.goodcode;

public interface Fly {

    String fly();

}

class CanFly implements Fly{

    public String fly() {
        return "I can fly";
    }

}

class CantFly implements Fly{

    public String fly(){
        return "I can't fly";
    }

}
