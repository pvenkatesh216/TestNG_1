package generalClasses;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number to find the Factorial");
		int s=scan.nextInt();
		//int number=4;
		int fact=1;
		for (int i=1; i<=s; i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
		
			
		
		

	}

}
