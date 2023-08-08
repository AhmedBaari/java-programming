import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int n;
		System.out.println("enter a number: ");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int fact = 1;
		for(int i=n;i>1;i--)
		fact = fact * i;
		System.out.println(fact+" is the factorial of "+n);
	}
}