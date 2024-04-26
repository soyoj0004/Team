package com.javalab.sec05;

public class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("자전거가 출발합니다..");
    }

    @Override
    public void stop() {
        System.out.println("자전거가 멈췄습니다. ");
    }

}

