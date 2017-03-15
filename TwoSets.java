import java.util.Scanner;

public class TwoSets 
{
 public static void main(String args[])
 {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int m = in.nextInt();
     int[] a = new int[n];
     for(int a_i=0; a_i < n; a_i++){
         a[a_i] = in.nextInt();
     }
     int[] b = new int[m];
     for(int b_i=0; b_i < m; b_i++){
         b[b_i] = in.nextInt();
     }
    int LCM = lcm_array(a);
    int GCD = gcd_array(b);
    int count=0;
    for(int i=LCM;i<=GCD;i=i+LCM)
    {
    	if(GCD%i==0)
    	{
    		count++;
    	}
    }
    System.out.println(count);
 }
 
 public static int gcd(int x, int y) {   
		   if(y == 0) 
		     return x;
		   else
		     return gcd(y, x % y);
	}
 
 public static int gcd_array(int arr[])
 {
	 int win=arr[0];
	 for(int i=1;i<arr.length;i++)
	 {
		 win = gcd(win,arr[i]);
	 }
	 return win;
 }
 
 public static int lcm(int x,int y)
 {
	 return (x*y/gcd(x,y));
 }
 
 public static int lcm_array(int arr[])
 {
	 int win=arr[0];
	 for(int i=1;i<arr.length;i++)
	 {
		 win = lcm(win,arr[i]);
	 }
	 return win;
 }
}
