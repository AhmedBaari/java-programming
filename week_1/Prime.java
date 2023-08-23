import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n;
		int prime = 1;
		System.out.println("enter a number: ");
		n = s.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				prime = 0;
				break;
			}
		}
		if(prime==1)
		System.out.println(n+" is a prime number");
		else
		System.out.println(n+" is not a prime number");
	}
}