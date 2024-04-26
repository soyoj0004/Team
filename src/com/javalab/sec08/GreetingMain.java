package com.javalab.sec08;

public class GreetingMain {
    public static void main(String[] args) {
        // 익명 구현 객체 생성
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("안녕하세요!");
            }
        };

        // 메소드 호출
        greeting.greet();
    }
}
