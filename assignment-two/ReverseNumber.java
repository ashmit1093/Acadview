import java.util.Scanner;

class ReverseNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");	
		Scanner S = new Scanner(System.in);
		int a = S.nextInt();
		int m;
		int rev = 0;
		int r; 
		
		m=a;
		
		while(m>0)
		{
			r = (m%10);
			rev = (rev * 10) + r;
			m = (m/10); 
		} 
		
		System.out.println("Reverse of a number is : " + " " + rev);	
	
	}
}