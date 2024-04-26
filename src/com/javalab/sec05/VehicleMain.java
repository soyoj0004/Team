package com.javalab.sec05;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        System.out.println("자동차를 이용합니다:");
        car.start();
        car.stop();

        System.out.println("자전거를 이용합니다:");
        bicycle.start();
        bicycle.stop();
    }
}

