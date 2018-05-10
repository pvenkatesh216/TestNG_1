package strings;

public class RepeatedCharacters {

	public static void main(String[] args) {
		
		String name="Venkatesham";
		char[] c= name.toCharArray();
				
		int size=name.length();
		int count=0;
		
		for (int i=0; i<=size; i++)
		{
			for (int j=0; j<i; j++)
			{
				if (c[j]==c[i])
				{
					count=count+1;
				}
			}
			System.out.println();
			
						
		}
		

	}

}
