import java.util.Scanner;

public class Median 
{
	public static void main(String args[])
	{
		System.out.println("Enter input string");
		Scanner sc=new Scanner(System.in);
		int arr1[];
		int arr2[];
		int s1= sc.nextInt();
		int s2= sc.nextInt();
		arr1=new int[s1];
		for(int i=0;i<s1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		arr2=new int[s2];
		for(int j=0;j<s2;j++)
		{
			arr2[j]=sc.nextInt();
		}
		findMedian(arr1,arr2);
	}
	public static int findMedian(int arr1[],int arr2[])
	{
		int med1;
		int med2;
		int cind1=arr1.length/2 + 1;
		int cind2=arr2.length/2 + 1;

			while(cind1!=arr1.length-2 || cind1!=1)
			{
				med1=arr1[cind1];
			}
			while(cind2!=arr2.length-2 || cind2!=1)
			{
				med2=arr2[cind2];
			}
			
		return 0;
	}
}
