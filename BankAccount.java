package com.company;

import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String name ,String id){
        customerName = name;
        customerId = id;
    }

    void deposit(int amount_des) {
        if(amount_des != 0){
            balance = balance + amount_des;
            previousTransaction = amount_des;
        }
    }

    void withdraw(int amount_with) {
        if(amount_with != 0){
            balance = balance - amount_with;
            previousTransaction = -amount_with;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0)
        {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdraw: ");
        }
        else{
            System.out.println("No Transaction occur" + Math.abs(previousTransaction));
        }


    }


    void showMenu(){
        char option='\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your Customer id is " + customerId + "\n");
        System.out.println("A. Check Balance:");
        System.out.println("B. Deposit:");
        System.out.println("C. WithDraw:");
        System.out.println("D. Previous Transaction:");
        System.out.println("E. Exit");

        do {
            System.out.println("======================================================");
            System.out.println("Enter an Option:");
            option = scanner.next().charAt(0);
            System.out.println("======================================================");
            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("--------------------------------------------------");
                    System.out.println("Balance: " + balance);
                    System.out.println("--------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("--------------------------------------------------");
                    System.out.println("Enter an amount to deposit:");
                    int amount_des = scanner.nextInt();
                    deposit(amount_des);
                    System.out.println("--------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("--------------------------------------------------");
                    System.out.println("Enter amount to withdraw: ");
                    int amount_with = scanner.nextInt();
                    withdraw(amount_with);
                    System.out.println("--------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("--------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("***************************************************");
                    break;

                default:
                    System.out.println("Invalid Option!!");
                    break;
            }
        }while (option != 'E');

        System.out.println("---- Thank you for using our services ----");
        
    }




}
