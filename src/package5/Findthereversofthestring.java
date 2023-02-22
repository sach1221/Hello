package package5;

public class Findthereversofthestring 
{
	public static void main(String[] args) 
	{
		String a= "sachin pawar";
		String rev= "";
		
		char x;
		
		for(int i=0; i<a.length(); i++)
		{
			x= a.charAt(i);
			rev= x+rev;
		}
		System.out.println(rev);
		
		
		
		
	}

}
