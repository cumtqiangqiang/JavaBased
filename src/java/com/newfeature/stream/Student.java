package com.newfeature.stream;

public class Student {
    private int age;
    private String city;

    public Student(int age, String city) {
        this.age = age;
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
