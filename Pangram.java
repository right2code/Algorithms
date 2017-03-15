import java.util.HashSet;
import java.util.Scanner;
public class Pangram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		boolean pan = check_Pangram(str);
		if(pan==true)
		{
			System.out.println("pangram");
		}
		else
		{
			System.out.println("not pangram");
		}
	}

	public static boolean check_Pangram(String str) 
	{	
		boolean pan=false;
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
			hs.add(ch);
			}
			if(hs.size()==26)
			{
				pan=true;
				break;
			}
		}
		return pan;
	}
}
