import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		int a = n, b=0, c = n, d, e=1, f = 0;
		while(a>0)
		{
			b = b + 1;
			a = a/10;
		}
		for(int j=1;j<b;j++)
		{e = e * 10;}
		for(int i=0;i<b;i++)
		{
			d = c % 10;
			d = d * e;
			f = f + d;
			c = c/10;
			e = e/10;
		}
		if(f==n)
		{System.out.println(n+" is a palindrome");}
		else
		{System.out.println(n+" is not a palindrome");}
	}
}