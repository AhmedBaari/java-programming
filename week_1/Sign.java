import java.util.Scanner;
class Sign
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n = s.nextInt();
		if(n>0)
		System.out.println("the number is positive");
		else if(n<0)
		System.out.println("the number is negative");
		else
		System.out.println("the number is zero");
	}
}