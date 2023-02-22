package package4;

public class Printoddandevennumbersfromarray 
{
	public static void main(String[] args) 
	{
		int a[]= {11,22,33,44,55};
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even numberr-"+  a[i]);
			}
			else
			{
				System.out.println("odd number-"+a[i]);
			}
		}
		
	}

}
