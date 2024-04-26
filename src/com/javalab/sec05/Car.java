package com.javalab.sec05;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("자동차가 출발합니다..");
    }

    @Override
    public void stop() {
        System.out.println("자동차가 멈췄습니다. .");
    }

}

