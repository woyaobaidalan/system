package com.company;
public class Student{
    private String classes;
    private String name;
    private int age;
    private  String ID;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Student(String classes, String name, int age, String ID) {
        this.classes = classes;
        this.name = name;
        this.age = age;
        this.ID = ID;
    }


}