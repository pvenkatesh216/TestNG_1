package generalClasses;

public class Vowels {

	public static void main(String[] args) {
		
		String name="Venkatesham";
		int l=name.length();
		for (int i=0; i<l; i++ )
		{
			char chars=name.charAt(i);
			if (chars=='a'||chars=='e'||chars=='i'||chars=='o'||chars=='u')
	    {
				System.out.print(chars);
			}
			
		}

	}

}
