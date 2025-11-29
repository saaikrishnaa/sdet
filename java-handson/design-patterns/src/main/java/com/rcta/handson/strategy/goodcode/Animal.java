package com.rcta.handson.strategy.goodcode;

public class Animal {

    private String name;
    private double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Fly flyType;

    public void setName(String givenName) {
        name = givenName;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double givenHeight) {
        height = givenHeight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(int givenWeight) {
        if (givenWeight < 0) {
            System.out.println("Weight to be greater than 0");
        } else {
            weight = givenWeight;
        }
    }

    public int getWeight() {
        return weight;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

//    public String fly(){
//        return "Can fly high";
//    }


    public String tryToFly(){
        return flyType.fly();
    }

    public void setFlyAbility(Fly givenFlyType){
        flyType = givenFlyType;
    }
}
