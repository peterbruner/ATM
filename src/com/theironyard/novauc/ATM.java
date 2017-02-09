package com.theironyard.novauc;

import java.util.Scanner;

public class ATM {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scanner2 = new Scanner(System.in);
    public static User user = new User();

    public static void main(String[] args) throws Exception {
	// write your code here

        user.setBalance(11.11 + 1);

        System.out.println("Welcome, smartest user ever");

        user.chooseName();
        user.chooseOption();




    }


}
