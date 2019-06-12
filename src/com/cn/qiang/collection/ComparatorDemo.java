package com.cn.qiang.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student stu = new Student("Tom1",15);
        Student stu1 = new Student("Tom2",16);
        Student stu2 = new Student("Tom3",19);
        students.add(stu);
        students.add(stu1);
        students.add(stu2);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        for (Student student:students) {
            System.out.println(student);
        }



    }
}
