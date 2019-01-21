//package com.company;
//
//import java.util.concurrent.locks.ReentrantLock;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        ReentrantLock reentrantLock = new ReentrantLock();
//        com.company.challenge7.BankAccount bankAccount = new com.company.challenge7.BankAccount("001", 1000, reentrantLock);
//
//
//        Thread thread1 = new Thread() {
//            public void run() {
//                bankAccount.deposit(300.00);
//                bankAccount.withdraw(50.00);
//                System.out.println("first thread 1");
//                bankAccount.printAccountNumber();
//
//            }
//        };
//
//        Thread thread2 = new Thread() {
//            public void run() {
//                bankAccount.deposit(203.75);
//                bankAccount.withdraw(100.00);
//                System.out.println("second thread 2");
//                bankAccount.printAccountNumber();
//            }
//        };
//
//        thread1.start();
//        thread2.start();
//
//
//
////        Person person1 = new Person(bankAccount);
////        Person person2 = new Person(bankAccount);
////
////        person1.bankAccount.deposit(300.00);
////        person1.bankAccount.withdraw(50.00);
////        person2.bankAccount.deposit(203.75);
////        person2.bankAccount.withdraw(100.00);
//
////        person1.start();
////        person2.start();
//
//
//    }
//}
//
//
//
//
//class  Person extends Thread{
//
//   // String name;
//    com.company.challenge7.BankAccount bankAccount;
//    Double money;
//
//    public Person(com.company.challenge7.BankAccount bankAccount, Double money) {
//       // this.name = name;
//        this.bankAccount = bankAccount;
//        this.money = money;
//
//
//    }
//
////    public String getName() {
////        return name;
////    }
//
//
////    public Double getMoney() {
////        return money;
////    }
//
//    public com.company.challenge7.BankAccount getBankAccount() {
//        return bankAccount;
//    }
//
//    public void setMoney(Double money) {
//        this.money = money;
//    }
//
////        public void setName(String name) {
////        this.name = name;
////    }
//
//    public void setBankAccount(com.company.challenge7.BankAccount bankAccount) {
//        this.bankAccount = bankAccount;
//    }
//
//    public  void run() {
//        bankAccount.deposit(money);
//        bankAccount.withdraw(money);
//    }
//
//}