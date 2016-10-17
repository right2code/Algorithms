// Solution to hackerrank question: https://www.hackerrank.com/challenges/bomber-man
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BomberMan 
{
    public static void main(String[] args) 
    {
    	int R;
    	int C;
    	Scanner sc=new Scanner(System.in);
    	R=sc.nextInt();
    	C=sc.nextInt();
    	long T;
    	T=sc.nextLong();
    	char a[][]=new char[R][C]; //after 1s
    	for(int i=0;i<R;i++)
    	{
    			a[i]=sc.next().toCharArray();
    	}
    	char b[][]=new char[R][C]; //after2s
    	for(int i=0;i<R;i++)
    	{
    		for(int j=0;j<C;j++)
    		{
    			b[i][j]='O';
    		}
    	}
    	char c[][]=new char[R][C]; //after3s
    	char d[][]=new char[R][C]; //detonating
    	for(int i=0;i<R;i++)
    	{
    		for(int j=0;j<C;j++)
    		{
    			if(a[i][j]=='O')
    			{
    				d[i][j]='x';
    				if(i<R-1)
    				{
    				d[i+1][j]='x';
    				}
    				if(i>0)
    				{
    				d[i-1][j]='x';
    				}
    				if(j<C-1)
    				{
    				d[i][j+1]='x';
    				}
    				if(j>0)
    				{
    				d[i][j-1]='x';
    				}
    			}
    			else if((a[i][j]=='.') && (d[i][j]!='x'))
    			{
    				d[i][j]='.';
    			}
    			else if((a[i][j]=='.') && (d[i][j]=='x'))
    			{
    				d[i][j]='x';
    			}
    		}
    	}
    	for(int i=0;i<R;i++)
    	{
    		for(int j=0;j<C;j++)
    		{
    			if(d[i][j]=='x')
    			{
    				c[i][j]='.';
    			}
    			else
    			{
    				c[i][j]='O';
    			}
    		}
    	}
    	
    	char e[][]=new char[R][C]; //detonating
    	char f[][]=new char[R][C]; //after5s
    	for(int i=0;i<R;i++)
    	{
    		for(int j=0;j<C;j++)
    		{
    			if(c[i][j]=='O')
    			{
    				e[i][j]='x';
    				if(i<R-1)
    				{
    				e[i+1][j]='x';
    				}
    				if(i>0)
    				{
    				e[i-1][j]='x';
    				}
    				if(j<C-1)
    				{
    				e[i][j+1]='x';
    				}
    				if(j>0)
    				{
    				e[i][j-1]='x';
    				}
    			}
    			else if((c[i][j]=='.') && (e[i][j]!='x'))
    			{
    				e[i][j]='.';
    			}
    			else if((c[i][j]=='.') && (e[i][j]=='x'))
    			{
    				e[i][j]='x';
    			}
    		}
    	}
    	for(int i=0;i<R;i++)
    	{
    		for(int j=0;j<C;j++)
    		{
    			if(e[i][j]=='x')
    			{
    				f[i][j]='.';
    			}
    			else
    			{
    				f[i][j]='O';
    			}
    		}
    	}
    	char out[][]=new char[R][C];
    	if(T%2==0)
    	{
        	for(int i=0;i<R;i++)
        	{
        		for(int j=0;j<C;j++)
        		{
        			out[i][j]=b[i][j];
        		}
        	}
    	}
        else if(T==1)
    	{
        	for(int i=0;i<R;i++)
        	{
        		for(int j=0;j<C;j++)
        		{
        			out[i][j]=a[i][j];
        		}
        	}
    	}
    	else if(T%4==1)
    	{
        	for(int i=0;i<R;i++)
        	{
        		for(int j=0;j<C;j++)
        		{
        			out[i][j]=f[i][j];
        		}
        	}
    	}
    	else
    	{
        	for(int i=0;i<R;i++)
        	{
        		for(int j=0;j<C;j++)
        		{
        			out[i][j]=c[i][j];
        		}
        	}
    	}
    	for(int i=0;i<R;i++)
    	{
    		for(int j=0;j<C;j++)
    		{
    			System.out.print(out[i][j]);
    		}
    		System.out.println();
    	}
    	
    }
}
