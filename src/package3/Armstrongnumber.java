package package3;

public class Armstrongnumber
{
	public static void main(String[] args) 
	{
		int n=153;
		int temp=n;
		int r, sum=0;
		while(temp>0)
		{
			r= temp%10;
			temp= temp/10;
			sum=sum+ r*r*r;
		}
		if(n==sum)
		{
			System.out.println(n+"-number is armstrong");
		}
		else
		{
			System.out.println(n+"-number is not armstrong");
		}
		
	}

}
