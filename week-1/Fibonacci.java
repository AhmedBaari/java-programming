import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		int a=0,b=1, c;
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of elements of the fibonacci series that you want: ");
		n = s.nextInt();
		System.out.println("the fibonacci series upto "+n+" elements is: ");
		System.out.println(a+"\n"+b);
		for(int i=0;i<n-2;i++)
		{
			System.out.println(a+b);
			c = b;
			b = a + b;
			a = c;
		}
	}
}