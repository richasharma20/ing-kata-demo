package com.kata.Controller;

import java.util.Scanner;

public class Customer {
	private String CustomerAccountNo;
    private String CustomerName;
    private long CustomerBalance;

    Scanner scanner = new Scanner(System.in);

    void openAccount() {
        System.out.print("Enter Account No: ");
        CustomerAccountNo = scanner.next();
        System.out.print("Enter Customer Name: ");
        CustomerName = scanner.next();
        System.out.print("Enter Customer Balance: ");
        CustomerBalance = scanner.nextLong();
    }

    void showCustomerBalance() {
        System.out.println("Customer's Account Balance Is: "+CustomerBalance);
    }

    void deposit() {
        long amt;
       
        if(CustomerBalance>0.01) {
        	 System.out.println("Enter amount customer wants to deposit : ");
             amt = scanner.nextLong();
        CustomerBalance = CustomerBalance + amt;
        System.out.println("Your current balance is: "+ CustomerBalance);
        }else
        	System.out.println("Customer Balance is less than 0.01 euro.");
    }

    void withdrawal() {
        long amt;
        System.out.println("Enter amount customer wants to withdraw : ");
        amt = scanner.nextLong();
        if (CustomerBalance >= amt) {
            CustomerBalance = CustomerBalance - amt;
            System.out.println("Your Current Balance is: "+ CustomerBalance);  
            
        } else {
            System.out.println("Balance is low. Please check balance.");
        }
    }

    boolean search(String acn) {
        if (CustomerAccountNo.equals(acn)) {
            return true;
        }
        return false;
    }
}
