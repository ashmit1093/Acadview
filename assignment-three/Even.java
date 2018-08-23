import java.util.Scanner;

class Even
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			if(i%2 ==0)
			{
		
				System.out.println(i);			

			}
		}
	}
}