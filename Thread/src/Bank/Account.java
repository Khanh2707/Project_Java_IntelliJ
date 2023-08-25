package Bank;

import java.util.PropertyPermission;

public class Account {
    public int balance = 3000;
    public synchronized boolean check(int val) {
        try {
            Thread.sleep(1000);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        return val < balance;
    }

    public synchronized void withDraw(String name, int value) {
        System.out.println(name+" with draw "+value);
        if (!check(value)) {
            try {
                System.out.println("Rút nhiều quá, đ đủ tiền");
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        balance -= value;
        System.out.println(name + " Success !");
        System.out.println(name+ " số dư: " +balance);
    }

    public synchronized void deposite(String name, int value) {
        System.out.println(name+" deposite "+value);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println(e);
        }
        balance += value;
        notify();
    }
}
