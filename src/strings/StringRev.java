package strings;

public class StringRev {

	public static void main(String[] args) {
		String Original="Origin";
		String rev="";
		
		for(int i=Original.length()-1; i>=0; i--)
		{
			rev=rev+Original.charAt(i);
		}
		System.out.println(rev);

	}

}
