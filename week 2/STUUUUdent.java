package com.company;
import java.util.Scanner;

class Student {
    private String name;
    private int id;
    private int year = 1;

    public int getID(){
        return id;
    }public String getName(){
        return name;
    }public int getYear(){
        return year;
    }
    public Student(String n, int id)
    {
        this.name = n;
        this.id = id;
    }
    public int increYear(){
        year++;
        return year;
    }

}

public class Main {
    public static void main(String[] args) {
        Student one = new Student("Asan" , 135464);
        System.out.println(one.getName() + " " + one.getID() + " " + one.increYear());
        one.increYear();
    }
}