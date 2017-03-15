import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Anagram {
    public static int numberNeeded(String first, String second) 
    {
    String letters1[]= first.split("//a");
    String letters2[]= second.split("//a");
    HashSet<String> h1=new HashSet<String>();
    HashSet<String> h2=new HashSet<String>();
    int res;
    for(int i=0;i<letters1.length;i++)
    {
    	h1.add(letters1[i]);
    }
    for(int i=0;i<letters2.length;i++)
    {
    	h2.add(letters2[i]);
    }
    if(h1.size()<=h2.size())
    {
    	h1.retainAll(h2);
    	res=h1.size();
    }
    else
    {
    	h2.retainAll(h1);
    	res=h2.size();
    }
    System.out.println(h2.size());
    return res;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
