package test;

import java.util.Scanner;

public class LargestNo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		System.out.println("Enter the digit");
		int digit=sc.nextInt();
		getLessThanNumber(num,digit);
	}
	public static void getLessThanNumber(int num, int digit){
		while((Integer.toString(num)).contains(Integer.toString(digit))){
		num--;
		}
		System.out.println(num);
		}
}

