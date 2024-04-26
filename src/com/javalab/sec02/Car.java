package com.javalab.sec02;


class Car implements Transport {
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

