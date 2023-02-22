package package3;

public class LCMoftwonumber 
{
	public static void main(String[] args) 
	{
		int a=16; 
		int b=24;
		int c=0;
		for(int i=1; i<=a; i++)
		{
			if(a%i==0 && b%i==0)
			{
				c=i;
			}
		}
		System.out.println((a*b)/c);
		
	}

}
