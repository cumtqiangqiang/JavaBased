package com.cn.reflect.demo1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo3 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Person.class;
        /**
         *
         *   Method[] getMethods()  获取类中所有的公共成员方法,包含父类的和接口中的
         *   了解:
         *  Method[] getDeclaredMethods()  获取声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
         *
         */
        Method[] methods = clazz.getMethods();
        for (Method m:methods){
            System.out.println(m);
        }
        System.out.println("------------------------");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
        System.out.println("-----------------------------");
        Method getNameMethod = clazz.getMethod("getName");
        System.out.println(getNameMethod);

        Method setNamemethod = clazz.getMethod("setName", String.class);
        System.out.println(setNamemethod);

        Method privateMethod = clazz.getDeclaredMethod("method");
        System.out.println(privateMethod);
        System.out.println("-----------------------------");

        Object obj = clazz.newInstance();
        Object v1 = getNameMethod.invoke(obj);
        System.out.println(v1);

        Object v2 = setNamemethod.invoke(obj,"Tom1");
        System.out.println(v2);

        System.out.println(obj);






    }
}
