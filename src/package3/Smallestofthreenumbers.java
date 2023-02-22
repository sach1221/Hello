package package3;

public class Smallestofthreenumbers 
{
	public static void main(String[] args) 
	{
		int a= 80; 
		int b=45; 
		int c=18;
		if(a<b && a<c)
		{
			System.out.println("a is smallest-"+a);
		}
		else if(b<a && b<c)
		{
			System.out.println("b is smallest-"+b);
		}
		else
		{
			System.out.println("c is smallest-"+c);
		}
		
	}

}
