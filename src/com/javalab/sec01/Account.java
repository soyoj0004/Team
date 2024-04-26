package com.javalab.sec01;



// 도메인 클래스: 계좌 클래스
class Account {
    private int accountId; // 계좌 번호
    private double balance; // 잔액

    // 생성자
    public Account(int accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    // 계좌 번호 getter
    public int getAccountId() {
        return accountId;
    }

    // 잔액 getter
    public double getBalance() {
        return balance;
    }

    // 입금 메서드
    public void deposit(double amount) {
        balance += amount;
    }

    // 출금 메서드
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    // 객체를 문자열로 표현하는 메서드
    @Override
    public String toString() {
        return "계좌정보{" +
                "계좌번호=" + accountId +
                ", 금액=" + balance +
                '}';
    }
}
