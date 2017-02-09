package com.theironyard.novauc;

/**
 * Created by peter on 2/8/17.
 */
public class User {

    String name;
    String option;
    double balance;
    String withdraw;
    String cancel;
    //public User(int a){}

    User(String name, String option, double balance, String withdraw, String cancel) {
        this.name = name;
        this.option = option;
        this.balance = balance;
        this.withdraw = withdraw;
        this.cancel = cancel;
        System.out.println("printed User variables");
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
        System.out.println("set balance done");
    }

    public void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        System.out.println("Welcome, " + name);
    }

    public User() {
    }

    public void chooseOption() throws Exception {
        int loopdiloop = 1;
        while(loopdiloop == 1) {
            System.out.println("What would you like to do? [Check balance / Withdraw funds / Cancel my life]");
            option = ATM.scanner.nextLine();
            if (option.equalsIgnoreCase("Check balance")) {
                System.out.println("Current balance: " + this.balance);
            }

            else if (option.equalsIgnoreCase("Withdraw funds")) {
                System.out.println("How much?");
                double moneyRequested = ATM.scanner2.nextDouble();
                if (this.balance >= moneyRequested) {
                    System.out.println("Printing " + moneyRequested);
                    this.balance = this.balance - moneyRequested;
                    System.out.println("Remaining balance: " + this.balance);
                } else {
                    System.out.println("Does not compute");
                }
            }

            else if (option.equalsIgnoreCase("Cancel my life")) {
                System.out.println("Good choice");
                loopdiloop = 0;


            } else {
                throw new Exception("Invalid balance statement");
            }
        }

    }
}
