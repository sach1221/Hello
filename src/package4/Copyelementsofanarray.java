package package4;

public class Copyelementsofanarray 
{

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,40,50};
		
		int b[]= new int [5];
		b[0]=a[0];
		b[1]=a[1];
		b[2]=a[2];
		b[3]=a[3];
		b[4]=a[4];
		for(int i=0; i<b.length; i++)
		{
		System.out.println(a[i]);
		}
	}
}
