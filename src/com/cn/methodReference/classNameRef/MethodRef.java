package com.cn.methodReference.classNameRef;

import java.util.function.Function;

public class MethodRef {
    public static void main(String[] args) {

        creatPerson(Person::new,"Tom");

    }

    private static void creatPerson(Function<String, Person> fun, String name) {

        Person person = fun.apply(name);

        System.out.println(person);

    }

}