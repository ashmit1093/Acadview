import java.util.Scanner;

class Max
{
	public static void main(String[] args)
	{
		System.out.println("Enter two numbers: ");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = s.nextLine();

		int c =Integer.parseInt(a);
		int d =Integer.parseInt(b);
		
		System.out.print("creates number is :");
		if(c>d)
		{	
			System.out.println(c);
		}
		else
		{
			System.out.println(d);
		}
	}
}