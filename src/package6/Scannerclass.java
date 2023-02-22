package package6;

import java.util.Scanner;

public class Scannerclass 
{
	public static void main(String[] args) 
	{
		Scanner c= new Scanner(System.in);
		System.out.println("enter the first number");
		int a=c.nextInt();
		System.out.println("enter the second number");
		int b= c.nextInt();
		int d= a-b;
	System.out.println(d);
		
	}

}
