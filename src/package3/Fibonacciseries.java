package package3;

public class Fibonacciseries
{
	public static void main(String[] args)
	{
	int a=1; 
	int b=2;
	System.out.print(a+" "+b);
	for(int i=1; i<=10; i++)
	{
		int c= a+b;
		a=b; 
		b=c;
		System.out.print(" "+c);
	}
		
	}

}
