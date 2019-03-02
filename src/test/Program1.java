package test;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the basic salary");
		double salary = sc.nextDouble();
		double hra = 50*(salary/100);
		double special = 75*(salary/100);
		double pf = 12*(salary/100);
		double totalSalary = salary +hra + special - pf;
		System.out.println("Salary is "+totalSalary);
	}

}
