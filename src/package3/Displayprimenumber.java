package package3;

public class Displayprimenumber 
{
	public static void main(String[] args) 
	{
		int n=83;
		int a=0;
		for(int i=2; i<83; i++)
		{
			if(n%i==0)
			{
				a=a+i;
			}
		}
			if(a==0)
			{
				System.out.println("number is prime-"+n);
			}
			else
			{
				System.out.println("number is not prime-"+n);
			}
		
	}

}
