package test;

import java.util.Scanner;

class FixedAccount {
	double calculateInterest(double balance)
	{
		int interest = 10;
		balance = interest*(balance/100);
		return balance;
	}
}
class SavingsAccount extends FixedAccount{
	public SavingsAccount(int balance) {
		// TODO Auto-generated constructor stub
		System.out.println("Interest on fixed account "+super.calculateInterest(balance));
	}
	double calculateInterest(double balance)
	{
		int interest = 5;
		balance = interest*(balance/100);
		return balance;
		
	}
}
class Main{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance");
		int balance = sc.nextInt();
		SavingsAccount account = new SavingsAccount(balance);
		System.out.println("Interest on savings account "+account.calculateInterest(balance));
	}
}
