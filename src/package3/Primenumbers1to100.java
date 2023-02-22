package package3;

public class Primenumbers1to100
{
	public static void main(String[] args)
	{
		int a=0;
		for(int no=1; no<=100; no++)
		{
			for(int i=2; i<=no-1; i++)
			{
				if(no%i==0)
					a=a+i;
			}
			if(a==0)
			{
				System.out.println(no);
			}
			else
			{
				a=0;
			}
		}
		
	}

}
