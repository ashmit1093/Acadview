import java.util.Scanner;

class PalindromeNumber
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
		
		if(a == rev)
		{	
			System.out.println("Number is Palindrome");
		}	
		else
		{
			System.out.println("Number is Not Palindrome");	
		}
	
	}
}