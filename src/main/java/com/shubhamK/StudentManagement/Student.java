package com.shubhamK.StudentManagement;

public class Student {
    private int admnNo;
    private String name;
    private int age;
    private String state;

    public Student(int admnNo, String name, int age, String state) {
        this.admnNo = admnNo;
        this.name = name;
        this.age = age;
        this.state = state;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admNo) {
        this.admnNo = admNo;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
