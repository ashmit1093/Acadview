import java.util.Scanner;

class Reverse
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner Scan = new Scanner(System.in);
		int a = Scan.nextInt();
		int m = a;
		int r;
		int rev=0;

		while(m>0)
		{
			r = (m%10);
			rev = (rev * 10)+r;
			m = m/10;
		}		
		
		System.out.println("Reverse of number " + a + " is " + rev);
		
	}
}