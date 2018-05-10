package strings;

import java.util.Arrays;

public class SecondLargestfromArray {

	public static void main(String[] args) {
		int large[]={23,43,12,67,90,45,76};
		Arrays.sort(large);
		System.out.println(large[large.length-2]);
		
		
	}

}
