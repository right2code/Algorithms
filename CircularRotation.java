import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularRotation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        int k=sc.nextInt();
        int q=sc.nextInt();
        for(int i=0;i<n;i++)
            {
            a[i]=sc.nextInt();
        }
        int b[]=new int[q];
        for(int i=0;i<q;i++)
            {
            b[i]=sc.nextInt();
            }
        int x[]=new int[n];
        if(k>n)
        {
        	k=(k%n);
        }
        x=rotate(a,k);
//        for(int i1=0;i1<n;i1++)
//        {
//        	System.out.println(x[i1]);
//        }
        for(int i=0;i<q;i++)
        {
        System.out.println(x[b[i]]);
        }
    }
    public static int[] rotate(int a[],int k)
    {
    	int n=a.length;
        int x[]=new int[n];
        int i=0;
        while(i<n)
        {
        	if(i<k)
        	{
        	x[i] = a[n-k+i];
        	}
        	else
        	{
        		x[i]=a[i-k];
        	}
        	i++;
        }
        return x;
    }
}