
public class GCD2 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		System.out.println(gcd(num1, num2));
	}

	public static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}

}
