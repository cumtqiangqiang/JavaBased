package com.newfeature.defaultfunc;

public class Car implements Vehicle,FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.bloHorn();
        System.out.println("我是一辆汽车");
    }
}
