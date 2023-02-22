package package4;

public class Printsmallestelementinarray 
{
	public static void main(String[] args) 
	{
		int a[]= {40,10,20,30,50};
		int min;
		min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min= a[i];
			}
		}
		System.out.println(min);
	}

}
