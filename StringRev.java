
public class StringRev {

	public static void main(String[] args) {
		String str="Hello";
		int l=str.length();
		String str1="";
		for(int i=l-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
