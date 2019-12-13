package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Arendar Alex Viktorovich");
        student.setGroup(4);
        student.setArrival(new Date());
        student.setCourse(1);
        student.setUniversity("Kuban state technological university");


        System.out.println(student.getFullName() + " учиться в " + student.getUniversity() +
                " на " + student.getCourse() + " курсе" + " в " + student.getGroup() + " группе" );
    }
}
