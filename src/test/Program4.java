package test;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int n = sc.nextInt();
		System.out.println("Enter the digit");
		int d = sc.nextInt();
		int c=0;
		int k=n;
		while(k!=0)
		{
			c++;
			k = k/10;
		}
		int[] a = new int[c];
		int i=0;
		int f = n;
		System.out.println(a.length);
		while(f!=0)
		{
			a[i] = f%10;
			i++;
			f = f/10;
		}
		int j;
		for ( j = 0; j < a.length; j++) {
			//System.out.println(a[j]);
			if(a[j]==d)
				break;
		}
		//System.out.println(j);
		for(int h=0;h<c;h++) {
			int sum = 0;
			if(j == h)
			{
				for(int t=j;j>=0;j--)
				{
					sum = sum + a[j];
				}
				n = n - sum++;
				break;
			}
		}
		System.out.println(n);
		/*if(j==0)
			k = k-1;
		else if(j==1)
			k = k-(a[0]+1);
		else if(j==2)
			k = k-(a[0]+a[1]+1);
		System.out.println(k);*/
	}

}
