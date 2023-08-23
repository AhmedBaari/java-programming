import java.util.Scanner;
class Gcd
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int max, a, b, gcd=1;
		System.out.println("enter 2 numbers");
		a = s.nextInt();
		b = s.nextInt();
		if(a>b)
		max = b;
		else
		max = a;
		for(int i=1;i<=max;i++)
		{
			if(a%i==0&&b%i==0)
			gcd = i;
		}
		System.out.println("the greatest common divisor of "+a+" and " + b+ " is "+ gcd);
	}
}