package com.rcta.handson.sms.runner;

import com.rcta.handson.sms.enums.CourseName;
import com.rcta.handson.sms.pojo.Student;

import java.util.*;

public class Runner {

    private static List<Student> studentList;

    public static void main(String[] args) {

        System.out.println("Student Management System");
        studentList = new ArrayList<>();

        List<String> existingCourses = new ArrayList<>(Arrays.asList("JAVA"));

        Student tonyStark = new Student("Tony Stark aka Iron Man", 20, "S-101",existingCourses);
        Student thor = new Student("Thor aka God of Thunder", 21, "S-201",new ArrayList<>(Arrays.asList("JAVA")));
        Student hulk = new Student("Hulk aka Rage Monster", 22, "S-301",new ArrayList<>(Arrays.asList("JAVA")));
        Student avengers = new Student("Avengers", 23, "S-401",new ArrayList<>(Arrays.asList("JAVA")));

        tonyStark.enrollCourse(String.valueOf(CourseName.PYTHON));
        thor.enrollCourse(String.valueOf(CourseName.JAVA));
        hulk.enrollCourse(String.valueOf(CourseName.PHYSICS));

//        tonyStark.printStudentInfo();
//        thor.printStudentInfo();
//        hulk.printStudentInfo();
//        avengers.printStudentInfo();

        studentList.add(thor);
        studentList.add(tonyStark);
        studentList.add(hulk);
        studentList.add(avengers);

        sortStudents();

    }

    private static void sortStudents(){
        Comparator<Student> studentNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Comparator<Student> studentIdComparator = (o1,o2) -> o1.getStudentId().compareTo(o2.getStudentId());
//        Comparator<Student> studentAgeComparator = (o1, o2) -> o1.getStudentAge().compareTo(o2.getStudentAge());


//        Collections.sort(studentList,studentNameComparator);
        Collections.sort(studentList,studentIdComparator);
        System.out.println(studentList);

    }
}