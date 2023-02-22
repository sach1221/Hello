package package5;

public class Reversstringwordbyword 
{
	public static void main(String[] args) 
	{
		String a= "pawar sachin";
		char b[]= a.toCharArray();
		String rev= "";
		for(int i=b.length-1; i>=0; i--)
		{
			rev+= b[i];	
		}
		System.out.println(rev);	
	}

}
