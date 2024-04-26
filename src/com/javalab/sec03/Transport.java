package com.javalab.sec03;

// 이동 수단 인터페이스
interface Transportation {
    // 추상 메소드
    void 출발하다();
    void 멈추다();
    void 연료를_채우다();

    // default 메소드
    default void 수리하다() {
        System.out.println("이동 수단을 수리합니다.");
    }
}

// 자동차 클래스
class Car implements Transportation {
    @Override
    public void 출발하다() {
        System.out.println("자동차가 출발합니다.");
    }

    @Override
    public void 멈추다() {
        System.out.println("자동차가 멈춥니다.");
    }

    @Override
    public void 연료를_채우다() {
        System.out.println("자동차의 연료를 채웁니다.");
    }
}

// 메인 클래스
public class Transport {
    public static void main(String[] args) {
        // 자동차 객체 생성
        Car car = new Car();

        car.출발하다();

        car.멈추다();


        car.연료를_채우다();


        car.수리하다();
    }
}

