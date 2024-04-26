package com.javalab.sec07;

public class Car2Main {
    public static void main(String[] args) {
        // 익명 자식 객체 생성 및 매개 변수로 전달
        Car2 car = new Car2();
        car.setTire(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체가 굴러갑니다.");
            }
        });


        car.run();
    }
}

