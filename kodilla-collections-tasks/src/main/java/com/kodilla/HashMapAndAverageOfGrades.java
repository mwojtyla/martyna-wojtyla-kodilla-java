package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;


class Student {
    String firstName;
    String lastName;
    String peselId;

    public Student(String firstName, String lastName, String peselId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }
    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        return this.firstName.equals(s.firstName) && this.lastName.equals(s.lastName) && this.peselId.equals(s.peselId);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(peselId.substring(0, 5));
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + peselId;
    }
}

class Grades {
    Double gradeOne;
    Double gradeTwo;
    Double gradeThree;
    Double gradeFour;
    Double gradeFive;

    public Grades(Double gradeOne, Double gradeTwo, Double gradeThree, Double gradeFour, Double gradeFive){
        this.gradeOne = gradeOne;
        this.gradeTwo = gradeTwo;
        this.gradeThree = gradeThree;
        this.gradeFour = gradeFour;
        this.gradeFive = gradeFive;
    }

    @Override
    public String toString() {
        return gradeOne + " " + gradeTwo + " " + gradeThree + " " + gradeFour  + " " + gradeFive;
    }


    public Double average(){
        return (gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive)/5;
    }

}

public class HashMapAndAverageOfGrades {
    public static void main (String[] args) {
        Student student1 = new Student("Jan", "Kowalski", "00012000834");
        Student student2 = new Student("Jerzy", "Nowak", "00082902581");
        Student student3 = new Student("Anna", "Kowal","00021103697");
        Student student4 = new Student("Jolanta", "Nowakowska", "00123032145");
        Student student5 = new Student("Adam", "Kowalczyk", "00030178524");

        Grades gradeStudent1 = new Grades(3.0,5.0,4.0,4.0,5.0);
        Grades gradeStudent2 = new Grades(3.0,3.0,4.0,3.0,4.0);
        Grades gradeStudent3 = new Grades(5.0,5.0,5.0,6.0,5.0);
        Grades gradeStudent4 = new Grades(6.0,5.0,6.0,5.0,6.0);
        Grades gradeStudent5 = new Grades(2.0,3.0,4.0,3.0,3.0);

        Map<Student, Grades> studentGrades = new HashMap<>();
        studentGrades.put(student1, gradeStudent1);
        studentGrades.put(student2, gradeStudent2);
        studentGrades.put(student3, gradeStudent3);
        studentGrades.put(student4, gradeStudent4);
        studentGrades.put(student5, gradeStudent5);


        for (Map.Entry<Student, Grades> entry : studentGrades.entrySet()){
            System.out.println(entry.getKey().firstName + " " + entry.getKey().lastName + ", the average of grades: " + entry.getValue().average());
        }
    }
}





