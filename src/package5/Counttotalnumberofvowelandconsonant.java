package package5;

public class Counttotalnumberofvowelandconsonant 
{
	public static void main(String[] args) 
	{
		int vcount=0, ccount=0;
		String s= "my name is sachin";
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)=='a' 
					|| s.charAt(i)=='e' 
					|| s.charAt(i)=='i' 
					|| s.charAt(i)=='o'
					|| s.charAt(i)=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println(vcount+"- vowels " +ccount+"-consonant");

	}

}
