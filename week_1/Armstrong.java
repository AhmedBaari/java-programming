import java.util.*;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int n = s.nextInt();
		int a = n, b=0, c = n, d, g, e=1, f = 0;
		while(a>0)
		{
			b = b + 1;
			a = a/10;
		}
		for(int i=0;i<b;i++)
		{
			d = c % 10;
			g = d;
			for(int j=1;j<b;j++)
			d = d * g;
			System.out.println(d);
			f = f + d;
			c = c/10;
		}
		if(f==n)
		{System.out.print(n+" is an armstrong number");}
		else
		{System.out.println(n+" is not an armstrong number");}
	}
}