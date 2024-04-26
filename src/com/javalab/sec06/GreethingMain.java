package com.javalab.sec06;

public class GreethingMain {
        public static void main(String[] args) {
            // 익명 자식 객체 생성과 동시에 인터페이스의 메소드 구현
            Greeting greeting = new Greeting() {
                @Override
                public void greet() {
                    System.out.println("안녕하세요!");
                }
            };

            // 인터페이스 메소드 호출
            greeting.greet();
        }
    }

