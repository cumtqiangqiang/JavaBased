package com.builder;

public class Student {
    private String name;
    private int age;
    private String email;

    private Student(Builder builder){
     name = builder.name;
     age = builder.age;
     email = builder.email;

    }
    public static Student.Builder builder() {
        return new Student.Builder();
    }
   public static class  Builder{
       private String name;
       private int age;
       private String email;

       public Builder name(String name){
           this.name = name;
           return this;
       }
       public Builder age(int age){
           this.age = age;
           return this;
       }
       public Builder email(String email){
           this.email = email;
           return this;
       }
       public  Student build() {
           return new Student(this);
       }


   }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}

