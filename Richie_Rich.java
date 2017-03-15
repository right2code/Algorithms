import java.util.Scanner;

public class Richie_Rich 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		String num=greatest_Pal(s,n,k);
		System.out.println(num);
	}
	private static String greatest_Pal(String s, int n, int k) 
	{
		String temp="-1";
		String best_String="-1";
		int count=0;
		StringBuilder s1 = new StringBuilder(s);
		int arr[]=new int[n];
		if(s.length()==1 && k<1)
		{
			return s;
		}
		if(s.length()==1 && k>=1)
		{
			s="9";
			return s;
		}
		if(k>=n)
		{
			for(int i=0;i<n;i++)
			{
				s1.setCharAt(i,'9');
			}
			return s1.toString();
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=1;
		}
		if(checkPal(s))
		{
			best_String=s;
		}
//while(count<=k)
//{
		for(int i=0;i<((n/2));i++)
		{

			if(s1.charAt(i)!=s1.charAt(n-i-1))
			{
						if(s1.charAt(i)<s1.charAt(n-i-1))
						{
							s1.setCharAt(i,s1.charAt(n-i-1));
							count++;
							arr[i]=0;
						}
						else
						{
						s1.setCharAt(n-i-1,s1.charAt(i));
						count++;
						arr[n-i-1]=0;
						}
						System.out.println(s1+" "+i+" "+count);
						if(checkPal(s1.toString()))
						{
							temp=s1.toString();
						}
			}
			if(count>=k)
			{
				break;
			}
		}
		if(greater(temp,best_String))
		{
			best_String=temp;
		}
		if(count<k)
		{
			int rem=k-count;
//			System.out.println(rem);
			if(k==1 && n%2!=0)
			{
				s1.setCharAt(n/2,'9');
				return s1.toString();
			}
			int i=0;
			while(rem>0 && i<n/2)
			{
				if(s1.charAt(i)=='9')
				{
					i++;
				}
				s1.setCharAt(i,'9');
				s1.setCharAt(n-i-1,'9');
				rem=rem-arr[i]-arr[n-i-1];
				i++;
			}
			temp=s1.toString();
			if(checkPal(temp) && greater(temp,best_String))
			{
				best_String=temp;
			}
		}
		return best_String;
	}
	private static boolean greater(String temp, String best_String) 
	{
		int t=Integer.parseInt(temp);
		int b=Integer.parseInt(best_String);
		if(t>b)
		{
			return true;
		}
		return false;
	}
	public static boolean checkPal(String str)
	{
		int l=str.length();
		int count=0;
		
		if(l==1)
		{
			return false;
		}
		
		for(int i=0;i<l/2;i++)
		{
				if((str.charAt(i))==(str.charAt(l-i-1)))
				{
					count++;
				}
		}
		if(count>=l/2)
		{
			return true;
		}
		return false;
	}
}
