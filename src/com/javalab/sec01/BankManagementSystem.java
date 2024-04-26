package com.javalab.sec01;

import java.util.ArrayList;
import java.util.Scanner;

public class BankManagementSystem {
    private static ArrayList<Customer> customers = new ArrayList<>(); // 고객 목록
    private static int customerIdCounter = 1; // 고객 ID 카운터
    private static int accountIdCounter = 8753154; // 계좌 번호 카운터

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 고객 등록");
            System.out.println("2. 계좌 개설");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 고객 및 계좌 목록 조회");
            System.out.println("6. 종료");
            System.out.print("메뉴 선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerCustomer(scanner);
                    break;
                case 2:
                    openAccount(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    withdraw(scanner);
                    break;
                case 5:
                    showCustomerAndAccountList();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
    }

    // 고객 등록 메서드
    private static void registerCustomer(Scanner scanner) {
        System.out.print("고객 이름을 입력하세요: ");
        String name = scanner.next();
        Customer customer = new Customer(customerIdCounter++, name);
        customers.add(customer);
        System.out.println("고객 등록이 완료되었습니다.");
        System.out.println(customer);
    }

    // 계좌 개설 메서드
    private static void openAccount(Scanner scanner) {
        System.out.print("고객 ID를 입력하세요: ");
        int customerId = scanner.nextInt();
        System.out.print("개설할 계좌의 초기 입금액을 입력하세요: ");
        double initialDeposit = scanner.nextDouble();

        Customer customer = findCustomerById(customerId);
        if (customer != null) {
            Account account = new Account(accountIdCounter++, initialDeposit);
            customer.addAccount(account);
            System.out.println("계좌가 개설되었습니다.");
            System.out.println(account);
        } else {
            System.out.println("일치하는 고객이 없습니다.");
        }
    }

    // 입금 메서드
    private static void deposit(Scanner scanner) {
        System.out.print("계좌 ID를 입력하세요: ");
        int accountId = scanner.nextInt();
        System.out.print("입금할 금액을 입력하세요: ");
        double amount = scanner.nextDouble();

        for (Customer customer : customers) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountId() == accountId) {
                    account.deposit(amount);
                    System.out.println("입금이 완료되었습니다. 현재 잔액: " + account.getBalance());
                    return;
                }
                System.out.println("일치하는 계좌가 없습니다.");
            }
        }
    }

    // 출금 메서드
    private static void withdraw(Scanner scanner) {
        System.out.print("계좌 ID를 입력하세요: ");
        int accountId = scanner.nextInt();
        System.out.print("출금할 금액을 입력하세요: ");
        double amount = scanner.nextDouble();

        for (Customer customer : customers) {
            for (Account account : customer.getAccounts()) {
                if (account.getAccountId() == accountId) {
                    account.withdraw(amount);
                    System.out.println("출금이 완료되었습니다. 현재 잔액: " + account.getBalance());
                    return;
                }
                System.out.println("일치하는 계좌가 없습니다.");
            }
        }
    }

    // 고객 ID로 고객을 찾는 메서드
    private static Customer findCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }

    // 고객 및 계좌 목록 조회 메서드
    private static void showCustomerAndAccountList() {
        System.out.println("======= 고객 및 계좌 목록 =======");
        for (Customer customer : customers) {
            System.out.println("고객 ID: " + customer.getCustomerId()
                    + ", 이름: " + customer.getName());
            System.out.println("계좌 목록:");
            for (Account account : customer.getAccounts()) {
                System.out.println("계좌 ID: " + account.getAccountId()
                        + ", 잔액: " + account.getBalance());
            }
            System.out.println("————————————————");
        }
    }
}