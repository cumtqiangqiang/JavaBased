package com.newfeature.reference;


import java.util.Arrays;
import java.util.List;

public class Car {
    interface Supplier<T>{
        T get();
    }

    public static Car create(final Supplier<Car> supplier){
        return supplier.get();
    }
    public static void collide(final Car car){
        System.out.println("Collided "+ car.toString());
    }
    public void follow(final Car another){
        System.out.println("Following the "+ another.toString());
    }
    public void repair(){
        System.out.println("Reparied " + this.toString());
    }

    public static void main(String[] args) {
        Car car = Car.create(Car::new);
        Car car1 = Car.create(Car::new);
        Car car2 = Car.create(Car::new);
        Car car3 = new Car();
        List<Car> cars = Arrays.asList(car, car1, car2, car3);
        System.out.println("=============构造器引用===========");
        cars.forEach(Car::collide);
        System.out.println("=============静态方法引用===========");
        cars.forEach(Car::repair);
        System.out.println("=============特定类的任意对象方法引用===========");
        Car police = Car.create(Car::new);
        cars.forEach(police::follow);
    }

}
