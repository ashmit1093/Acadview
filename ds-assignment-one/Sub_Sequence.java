import java.util.Scanner;

public class Sub_Sequence
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  string: ");
    String str=s.nextLine();
    s.close();
    
		sub(str,"");
	}
	static void sub(String input,String output)
	{
		if(input.length()==0)
		{
			System.out.print(output+" ");
      return;
		}
		sub(input.substring(1),output);
		sub(input.substring(1),output+input.charAt(0));
	}
}