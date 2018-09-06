public class GCD{
	public static void main(String[] args)
	{
		System.out.println(gcd(10, 5));
		System.out.println(gcd(8, 2));
		System.out.println(gcd(7000, 2000));
		System.out.println(gcd(2000, 7000));
		System.out.println(gcd(10, 11));
		System.out.println(gcd(239, 293));
	}

	static int gcd(int a, int b)
	{
		if(a == 0){return b;}
		if(b == 0){return a;}

		int squaredNum;
		for(squaredNum = 0; ((a|b)&1)==0; squaredNum++){
			a >>>= 1;
			b >>>= 1;
		}

		while((a & 1)==0){a >>>= 1;}

		while(b != 0){
			while((b & 1) == 0){
				b >>>= 1;
			}
			if(a > b)
			{
				int temp = a;
				a = b;
				b = temp;
			}
			b -= a;
		}

		return a<<squaredNum;
	}
}
