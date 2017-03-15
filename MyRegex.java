import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex extends Solution {
    private static final String pattern =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	//public String pattern = "^" + pat + "\\." + pat + "\\." + pat + "\\."  + pat + "$";
    String IP;
    public MyRegex(String iP) { 
        // Write your code here
        this.IP=iP;
    }
    
    public boolean isMatch() {
      Pattern pattern1 = Pattern.compile(pattern);
  	  Matcher matcher = pattern1.matcher(IP);
  	  return matcher.matches();
        
    }
}