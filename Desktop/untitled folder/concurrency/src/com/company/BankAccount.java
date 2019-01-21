package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private String accountNumber;
    private ReentrantLock reentrantLock;

    public BankAccount(String accountNumber, double initialBalance, ReentrantLock reentrantLock) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.reentrantLock = reentrantLock;
    }

    public boolean deposit(double amount) {
        boolean status = false;
        try{
            if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance += amount;
                    status = true;
                }finally {
                    reentrantLock.unlock();
                }
            } else {
                System.out.println("Couldn't lock it");
            }
            } catch(InterruptedException e ) {
        }
        System.out.println("Transaction status: " + status);
        return status;
    }

    public  void withdraw(double amount) {
        boolean status = false;
        try {
            if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    balance -= amount;
                    status = false;
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                System.out.println("Couldn't lock it");
            }
        }catch (InterruptedException e ){
            }
        System.out.println(" Transaction status: " + status);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber (){
        System.out.println("The account number is: " + this.accountNumber);
    }
}
