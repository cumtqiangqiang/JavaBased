package com.learn.coreclass;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class JavaBean {
    public static void main(String[] args) throws IntrospectionException {
       BeanInfo info =  Introspector.getBeanInfo(Person.class);
        for (PropertyDescriptor pd :info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println(pd.getReadMethod());
            System.out.println(pd.getWriteMethod());
        }
    }
}
