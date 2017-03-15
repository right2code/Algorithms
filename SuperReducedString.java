import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString 
{

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	String in=sc.next();
    	int l = in.length();
    	for(int i=1;i<l;i++)
    	{
    		if(in.charAt(i)==in.charAt(i-1))
    		{
    			in = in.substring(0,i-1) + in.substring(i+1);
    			l = in.length();
    			i=0;
    		}
    	}
    	if(in.length()==0)
    	{
    		System.out.println("Empty String");
    	}
    	else
    	{
    	System.out.println(in);
    	}
    }
}