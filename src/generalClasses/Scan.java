package generalClasses;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter a number");
		int x=in.nextInt();
		System.out.println("Enter another number");
		int y=in.nextInt();
		System.out.println("Addition of above two numbers is "+(x+y));

	}

}
