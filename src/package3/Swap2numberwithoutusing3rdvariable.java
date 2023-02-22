package package3;

public class Swap2numberwithoutusing3rdvariable
{
	public static void main(String[] args) 
	{
		int a=75;
		int b= 25;
		int c;
	a= a+b;
	b=a-b;
	System.out.println("value of b is-"+b);
		a=a-b;
	System.out.println("value of a is-"+a);
	
		c=a;
		a=b;
		System.out.println(a);
		b=c;
		System.out.println(b);
	
		
		
	}

}
