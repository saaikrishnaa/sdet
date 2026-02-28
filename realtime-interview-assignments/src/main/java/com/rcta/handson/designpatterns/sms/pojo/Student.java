package com.rcta.handson.designpatterns.sms.pojo;

import com.rcta.handson.designpatterns.sms.enums.CourseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
    private String name;
    private int age;
    private String id;
    private List<String> courses;

    public Student(String name, int age, String id, List<String> courses){
        if(validateStudentAge(age) && validateStudentName(name) && validateStudentId(id)) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.courses = courses;
        }
    }

    public Student(String name, int age, String id){
        this(name, age, id, new ArrayList<>());
    }

    public Student(List<String> courses){
       this("", 0, "", courses);
    }

    public Student() {

    }


    public List<String> getCourses(){
        return courses;
    }

    public List<String> enrollCourse(String newCourse){
            if (getCourses() != null && validateCourse(newCourse)) {
                List<String> existingCourses = getCourses();
                if (!existingCourses.contains(newCourse)) {
                    getCourses().add(newCourse);
                }
            }
        return courses;
    }

    public boolean validateStudentAge(int age){
        if(age >= 19 && age <= 100)
            return true;
        else
            System.err.println("Age must be in the range of 19 and 35");
        return false;

    }

    public boolean validateStudentName(String name){
        String regularExpression = "^[a-zA-Z\\s]+$";
        Pattern patternOfMyInterest = Pattern.compile(regularExpression);
        Matcher matcher = patternOfMyInterest.matcher(name);
        if(matcher.matches()){
            return true;
        }else{
            System.err.println("Given name is invalid, Re-enter a proper name");
            return false;
        }
    }

    private boolean validateStudentId(String id) {

        String regularExpression = "S-\\d+$";
        Pattern patternThatISuggestedToBeValid = Pattern.compile(regularExpression);
        Matcher doesInputMatchWithThePatternSuggested = patternThatISuggestedToBeValid.matcher(id);

        if(doesInputMatchWithThePatternSuggested.matches()){
            return true;
        }else{
            System.err.println("The user id is not as per the criteria, try using S-0123456789");
            return false;
        }
    }

    public boolean validateCourse(String course){
       if(course.equalsIgnoreCase(String.valueOf(CourseName.JAVA)) || course.equalsIgnoreCase(String.valueOf(CourseName.PHYSICS)) || course.equalsIgnoreCase(String.valueOf(CourseName.PYTHON))) {
           return true;
       }else{
           System.err.println("You have not provided a valid course");
           return false;
       }
    }


    public void printStudentInfo(){
        System.out.println("Student's name: "+this.name+", Student's id: "+this.id+", Student's Age: "+this.age+", and the courses enrolled by the student are: "+this.courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", courses=" + courses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(id, student.id) && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id, courses);
    }

    public String getStudentId() {
        return id;
    }

    public String getName() {
    return name;
    }

    public int getStudentAge(){
        return age;
    }
}

