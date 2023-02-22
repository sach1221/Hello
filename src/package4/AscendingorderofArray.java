package package4;

public class AscendingorderofArray 
{
	public static void main(String[] args) 
	{
		int a[]= {4,5,7,3,6,8,1,2};
		int temp=0;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];		//temp=4
					a[i]=a[j];		//4=2
					a[j]=temp;		//2=temp
				}
			}
			System.out.print(a[i]+" ");
		}
		
	}

}
