import java.util.Scanner;

public class Mars 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(find_Changes(s));
		sc.close();
	}
	private static int find_Changes(String s) 
	{
		String s_real="SOS";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i))!=(s_real.charAt(i%3)))
			{
				count++;
			}
		}
		return count;
	}
}
