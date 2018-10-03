import java.util.Scanner;
public class SumOfDigit
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
    String str=s.nextLine();
    s.close();

		int sum=result(str);
		System.out.println("Sum is :"+sum);
	}
	static int result(String str)
	{
    int s=0;
    if(str.length()==0)
    {
      return 0;
    }
    
    if((str.charAt(0))>=48&&(str.charAt(0))<=57)
    {
      s=str.charAt(0)-48+result(str.substring(1));
      return s;
    }

    s=result(str.substring(1));
    return s;
	}
}