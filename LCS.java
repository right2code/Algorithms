import java.util.*;
public class LCS {

	public static void main(String[] args) 
	{
		System.out.println("Enter input string");
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.next();
		System.out.println(checkString(str));
		
	}
	public static String checkString(String str)
	{
		String ans="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length()+1;j++)
			{
				String s=str.substring(i, j);
				if(checkRep(s) && (s.length()>ans.length()))
				{
					ans = s;
				}
			}
		}
		return ans;
	}

	public static boolean checkRep(String s)
	{
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		if(hs.size() == s.length())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
