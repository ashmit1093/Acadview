import java.util.Scanner;
public class Balance
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String: ");
    String str=s.nextLine();
    
    s.close();

		int result=Checkbalance(str);
    
    if(result==0)
    {
      System.out.println("Balanced");
    }

    else
    {
      System.out.println("Not Balanced");
    }
	}
	static int Checkbalance(String str)
	{
    int c=0;

    if(str.length()==0)
    {
      return 0;
    }

    if(str.charAt(0)=='('||str.charAt(0)=='{'||str.charAt(0)=='[')
    {
      c=1+Checkbalance(str.substring(1));

      return c;

    }
    else
    {
      c=Checkbalance(str.substring(1))-1;

      return c;
    }
  }
}
