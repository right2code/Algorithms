import java.util.*;

public class HandRank 
{
	String value;
	String suit;
	HandRank()
	{
		
	}
	HandRank(String val,String s)
	{
		value=val;
		suit=s;
	}
public static void main(String args[])
{
	HandRank card1=new HandRank("K","H");
	HandRank card2=new HandRank("A","D");
	HandRank obj=new HandRank();
	int scr=obj.ChenFormula(card1,card2);
	System.out.println(scr);
}

public int ChenFormula(HandRank card1, HandRank card2){
int baseScore = Max(Score(card1), Score(card2));
if(card1.value == card2.value) { /* if is pair */
baseScore = Max(5, baseScore * 2);
}
if(card1.suit == card2.suit) {
baseScore += 2;
}
int gap = gapCal(card1.value,card2.value);
switch(gap) {
case 0: break;
case 1: baseScore++; break;
case 2: baseScore--; break;
case 3: baseScore-= 2; break;
case 4: baseScore-= 4; break;
default: baseScore-= 5; break;
}
return Math.abs(baseScore - gap);
}

public int Score(HandRank card) {
	float val;
switch(card.value) {
case "A": return 10;
case "K": return 8; 
case "Q": return 7; 
case "J": return 6; 
default: val=Float.parseFloat(card.value); return  (int)(val / 2.0);
}
}

public int gapCal(String val1,String val2)
{
	String order[]=new String[]{"0","A","2","3","4","5","6","7","8","9","10","J","Q","K","A"};
	List ll= Arrays.asList(order);
	if(!val1.equals("A") && !val2.equals("A"))
	{
		return Math.abs(ll.indexOf(val1)-ll.indexOf(val2));
	}
	else if(val1.equals("A") && !val2.equals("A"))
	{
		int a = Math.abs(1-ll.indexOf(val2));
		int b = Math.abs(14-ll.indexOf(val2));
		int ret = Math.min(a, b);
		
		return ret;
	}
	else if(!val1.equals("A") && val2.equals("A"))
	{
		int a = Math.abs(1-ll.indexOf(val1));
		int b = Math.abs(14-ll.indexOf(val1));
		int ret = Math.min(a, b);
		System.out.println(ret);
		return ret;
	}
	else
	{
		return 0;
	}
}
public int Max(int a,int b)
{
	if(a>b)
		return a;
	else
		return b;
}
}
