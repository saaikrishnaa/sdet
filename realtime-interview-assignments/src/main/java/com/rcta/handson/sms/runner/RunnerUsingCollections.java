package com.rcta.handson.sms.runner;

import com.rcta.handson.sms.pojo.Student;
import com.rcta.handson.sms.enums.CourseName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunnerUsingCollections {

    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Student Management System");

        List<String> existingCourses = new ArrayList<>(Arrays.asList("JAVA"));

        Student tonyStark = new Student("Tony Stark aka Iron Man", 20, "S-101",existingCourses);
        Student thor = new Student("Thor aka God of Thunder", 21, "S-201",new ArrayList<>(Arrays.asList("JAVA")));
        Student hulk = new Student("Hulk aka Rage Monster", 22, "S-301",new ArrayList<>(Arrays.asList("JAVA")));

        tonyStark.enrollCourse(String.valueOf(CourseName.PYTHON));

        thor.enrollCourse(String.valueOf(CourseName.JAVA));

        hulk.enrollCourse(String.valueOf(CourseName.PHYSICS));

//        tonyStark.printStudentInfo();
//        thor.printStudentInfo();
//        hulk.printStudentInfo();


        students.add(tonyStark);
        students.add(thor);
        students.add(hulk);

        Student result = findStudentById("S-101");
        if(result!= null) {
            result.printStudentInfo();
        }
    }

    public static Student findStudentById(String studentId){
        Student result = null;
        try {
            result = students.stream()
                    .filter(s -> s.getStudentId().equalsIgnoreCase(studentId))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("No information found fot the student"));
        }catch (RuntimeException e){
            System.err.println("Student with id: "+studentId+", is not found");
        }
        return result;
    }
}