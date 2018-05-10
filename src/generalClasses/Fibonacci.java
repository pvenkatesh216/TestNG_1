package generalClasses;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0; int b=1; int c;
		
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number till which you want to find the fib series");
		
		int n=scan.nextInt();
		
		
		while (c<n)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}

	}

}
