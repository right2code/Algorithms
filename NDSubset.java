import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NDSubset {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
    	HashSet set = new HashSet();
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int[] array = new int[n];
    	for(int a = 0; a<n; a++ ){
    		array[a] = sc.nextInt();
    	}
    	for(int a = 0; a< n - 1; a++){
    		//System.out.println("inside for "+array[a]+" "+array[a+1]);
    		for(int b = a + 1; b< n; b++){
    			if((array[a] + array[b])% k != 0){
        			set.add(array[a]);
        			set.add(array[b]);
        		//	System.out.println(array[a]+" "+array[a+1]);
        		}
    		}
    		
    	}
    	//System.out.println("\n\n"+set);
    	System.out.println(set.size());
    }
}