import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Two_Characters {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        int charCount = 0;
        char temp;
        Set<Character> l=new HashSet<Character>();
        for( int i = 0; i < s.length( ); i++ )
        {
         temp = s.charAt( i );
            l.add(temp);
        }
        		String str = "";
        		for (char x : l) {
			str = str + x;
		}
        int num_char=l.size();
       
             String t="";
		int max_count = 0;
        for(int i=0;i<num_char-1;i++)
        {
        	for(int j=i+1;j<num_char;j++)
        	{
        		char ch1 = str.charAt(i);
        		char ch2 = str.charAt(j);
        		int flag=0;
        		int count=0;
        		for(int k=0;k<s.length();k++)
        		{
        			if(s.charAt(k)==ch1)
        			{
        				if((flag==1||count==0))
        				{
        				flag=0;
        				count++;
        				}
        				else
        				{
        					count=0;
        					break;
        				}
        			}
        			else if(s.charAt(k)==ch2)
        			{
        				if(flag==0)
        				{
        				flag=1;
        				count++;
        				}
        				else
        				{
        					count=0;
        					break;
        				}
        			}
                    
        		}
        		if(count>max_count)
        		{
        			max_count=count;
        		}
        	}
        	
        }
        System.out.println(max_count);
    }
}