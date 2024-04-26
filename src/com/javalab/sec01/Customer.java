package com.javalab.sec01;

import java.util.ArrayList;


// 도메인 클래스: 고객 클래스
class Customer {
    private int customerId; // 고객 ID
    private String name; // 고객 이름
    private ArrayList<Account> accounts; // 계좌 목록

    // 생성자
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // 고객 ID getter
    public int getCustomerId() {
        return customerId;
    }

    // 고객 이름 getter
    public String getName() {
        return name;
    }

    // 계좌 목록 getter
    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    // 계좌 추가 메서드
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "고객정보{" +
                "고객ID=" + customerId +
                ", 고객이름='" + name + '\'' +
                '}';
    }
}

