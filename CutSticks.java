import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        cut(arr,n);
    }

	private static void cut(int[] arr, int n) 
	{
		int l=0;
		while(l<n)
		{
			System.out.println(n-l);
			Arrays.sort(arr);
			int x=0;
			while(arr[x]<=0)
			{
				x++;
			}
			int ce= arr[x];
			for(int i=0;i<n;i++)
			{
				arr[i]=arr[i]-ce;
				if(arr[i]==0)
				{
					l++;
				}
			}
			//System.out.println("c"+ce);
		}
		
	}
}