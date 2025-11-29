package com.rcta.handson.sms.runner;

import com.rcta.handson.sms.pojo.Student;

import java.util.*;

public class RunnerWithCLI {

    private static List<Student> studentList;

    public static void main(String[] args) {

        System.out.println("Student Management System");

        Student currentStudent;
        List<Student> students = new ArrayList<>();
        boolean addNextStudent = true;

        //now, input new student details and enroll the students in courses via console
        Scanner scanner = new Scanner(System.in);
        while(addNextStudent) {
            System.out.println("Enter student details");

            System.out.println("Student Name ?");
            String enteredName = scanner.next();scanner.nextLine();

            System.out.println("Student Age ?");
            int enteredAge = scanner.nextInt();scanner.nextLine();

            System.out.println("Student Id ?");
            String enteredId = scanner.nextLine();

            System.out.println("Courses that the student want to enroll ?");
            String course = scanner.nextLine();
            String[] coursesList = course.split(",");

            List<String> listOfCourses = new ArrayList<>();
            for (String currentCourseName : coursesList) {
                 listOfCourses.add(currentCourseName);
            }

            System.out.println(enteredName+", "+enteredAge+", "+enteredId+", "+listOfCourses);

            //now, assigning the read values to the Student object
            currentStudent = new Student(enteredName, enteredAge, enteredId, listOfCourses);

            students.add(currentStudent);

            System.out.println("Do you want to add another student record(y/n)?");
            addNextStudent = scanner.next().equalsIgnoreCase("y");


        }

        System.out.println("The list of students those got added until now and their details include");
        students.forEach(Student::printStudentInfo);


    }

//    private static void sortStudents(){
//        Comparator<Student> studentNameComparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
//
//        Comparator<Student> studentIdComparator = (o1,o2) -> o1.getStudentId().compareTo(o2.getStudentId());
////        Comparator<Student> studentAgeComparator = (o1, o2) -> o1.getStudentAge().compareTo(o2.getStudentAge());
//
//
////        Collections.sort(studentList,studentNameComparator);
//        Collections.sort(studentList,studentIdComparator);
//        System.out.println(studentList);
//
//    }
}