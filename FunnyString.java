import java.util.Scanner;

public class FunnyString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String s[]=new String[t];
		for(int i=0;i<t;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<t;i++)
		{
			check_Funny(s[i]);
		}
		sc.close();
	}
	private static void check_Funny(String s) 
	{
		StringBuilder stringName = new StringBuilder(s);
		String r = stringName.reverse().toString();
		int count=0;
		for(int i=1;i<=s.length()-1;i++)
		{
			if(Math.abs(s.charAt(i)-s.charAt(i-1))==Math.abs(r.charAt(i)-r.charAt(i-1)))
			{
				count++;
			}
			else
			{
				break;
			}
		}
		if(count==s.length()-1)
		{
			System.out.println("Funny");
		}
		else
		{
			System.out.println("Not Funny");
		}
	}
}
