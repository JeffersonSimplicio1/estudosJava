package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account = new Account(0, null, 0);
		
		System.out.println("Enter Account Number: ");
		int number = account.getNumber();
		System.out.println("Enter account holder: ");
		String holder = account.getHolder();
		System.out.println("Is there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(account.getNumber(), account.getHolder(), initialDeposit);
			
		} else {
			account = new Account(account.getNumber(), account.getHolder());
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.deposit(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
