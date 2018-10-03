import java.util.Scanner;
import java.util.Arrays;

class Reverse
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		
		StringBuffer str2 = new StringBuffer(str);
		
		str2.reverse();
		
		System.out.println("Reversed string is " + str2);	
		
	}

}