package strings;

public class StringOperations {

	public static void main(String[] args) {
		
		String name="Venkatesham";
		//String name1="Good";
		//int s= name.length();
		/*System.out.println("No.of Chars in the String are "+s);
		String toUpper=name.toUpperCase();
		System.out.println(toUpper);
		String toLower=name.toLowerCase();
		System.out.println(toLower);
		String concat=name+name1;
		System.out.println(concat);
		String trim=name.trim();
		int c=trim.length();
		System.out.println(trim);
		System.out.println(c);*/
		
		String rev="";
		
		for (int i=name.length()-1;i>=0; i--)
		{
			rev+=name.charAt(i);
		}
		System.out.println(rev);
		
		

	}

}
