package com.kata.Controller;

import java.util.Scanner;

public class MainCustomer {
	
	public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How Many Customer U Want to Input : ");
        int n = scanner.nextInt();
        Customer C[] = new Customer[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Customer();
            C[i].openAccount();
        }
        
        int ch;
        do {
            System.out.println("Main Menu\n1. Deposit\n2. Withdrawal\n3. Display Ammount\n4.Exit ");
                System.out.println("Enter your choice: "); ch = scanner.nextInt();
                switch (ch) {
                 
                    case 1:
                        System.out.print("Enter Account No: ");
                        String acn = scanner.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account does not exists");
                        }
                        break;

                    case 2:
                        System.out.print("Enter Account No: ");
                        acn = scanner.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Account does not exists");
                        }
                        break;
                     
                    case 3:
                    	
                    	 System.out.print("Enter Account No: ");
                    	 acn = scanner.next();
                    	 boolean match = false;
                         for (int i = 0; i < C.length; i++) {
                             match = C[i].search(acn);
                             if (match) {
                                 C[i].showCustomerBalance();
                                 break;
                             }
                         }
                         if (!match) {
                             System.out.println("Account does not exists");
                         }
                         break;

                    case 4:
                        System.out.println("Bye");
                        break;
                }
            }
            while (ch != 4);
        }
    }
