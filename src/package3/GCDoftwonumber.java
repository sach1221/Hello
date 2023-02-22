package package3;

public class GCDoftwonumber
{
	public static void main(String[] args) 
	{
		int a=16;
		int b=24;
		int c=0;
		for(int i=1; i<=b; i++)
		{
			if(a%i==0 && b%i==0)
			{
				c=i;
			}
			
		}
		System.out.println(c);
		
	}
}
