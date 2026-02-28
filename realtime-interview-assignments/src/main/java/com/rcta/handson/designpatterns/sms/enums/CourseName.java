package com.rcta.handson.designpatterns.sms.enums;

public enum CourseName {
    JAVA("Languages"),
    DONTNET("Languages"),
    PYTHON("Bigdata"),
    HORTONWORKS("Bigdata"),
    MATHS("Core"),
    PHYSICS("Core");

    private final String category;

    CourseName(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }
}
