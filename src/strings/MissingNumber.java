package strings;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] number={1,2,3,4,6};
		int missingNumber=getMissedNumber(number,6);
		System.out.printf("Missing number from the array %s is %d %n",Arrays.toString(number),missingNumber);
		}

	private static int getMissedNumber(int[] number, int n) {
		
		int actualSize=0;
		int expectedSize=n*(n+1)/2;
		for (int i:number)
		{
			actualSize=actualSize+i;
		}
		return expectedSize-actualSize;
		
	}

}
