package com.javalab.sec02;

public class TransportMain {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Transport car = new Car();

        // 선박 객체 생성
        Transport ship = new Ship();

        // 자동차의 메소드
        car.출발하다();
        car.멈추다();
        car.연료를_채우다();

        // 선박의 메소드
        ship.출발하다();
        ship.멈추다();
        ship.연료를_채우다();
    }
}


