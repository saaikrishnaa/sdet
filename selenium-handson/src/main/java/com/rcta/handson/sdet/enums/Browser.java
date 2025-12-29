package com.rcta.handson.sdet.enums;

public enum Browser {

    CHROME("chrome"),
    EDGE("edge"),
    FIREFOX("firefox");

    private final String browserName;

    Browser(String name){
        this.browserName = name;
    }

    public String getName(){
        return browserName;
    }

}
