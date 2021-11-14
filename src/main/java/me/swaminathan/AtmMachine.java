package me.swaminathan;

import java.io.IOException;
import java.util.Scanner;

public class AtmMachine{
	String name;
	Double balance;
	public static void main(String[] args) throws IOException {  
	Scanner sc= new Scanner(System.in);
	while(true) {
	System.out.println(
	"\n\n\n\n\nState Bank of India ATM \n"
	+"=========================\n"
	+"\n 1. Deposit"
	+ "\n 2. Check Balance"
	+ "\n 3. Print Passbook"
	+ "\n 4. Withdraw"
	+ "\n 5. Remove Card"
	+ "\n 6. Shutdown");
	
	int a=sc.nextInt();

	switch (a) {
	case 1:
		System.out.println("\nPlease Enter Amount to Deposit");
		break;
	case 2:
		System.out.println("\nYour Total Amount : ₹ 5,00,000");
		break;
	case 3:
		System.out.println("\nPlease Insert the Passbook");
		break;
	case 4:
		System.out.println("\nPlease Enter Amount to Withdraw");
		break;
	case 5:
		System.out.println("\nPlease Take your card to Exit");
		break;
	case 6:
		System.out.println("\npress enter to shutdown...");
		System.in.read();
		break;

	default:
		System.out.println("\nInvalid Option ");
		break;
	}
	if (a==6) { 
		System.out.println("\nShutting down..... ");
		break;
	}
	}
	
	}
}




