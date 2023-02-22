package package4;

public class Secondlargestelementinarray 
{
	public static void main(String[] args) 
	{
		int a[]= {1,5,2,8,6,4,3,7};
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[1]+"-2nd largest element");
		
	}

}
