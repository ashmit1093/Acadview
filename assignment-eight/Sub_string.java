import java.util.Scanner;

class Sub_string
{
  public static void main(String[] args)
  {
    String str;

    Scanner s=new Scanner(System.in);

    System.out.println("Enter String");
    str=s.nextLine();

    int len=str.length();

    for(int i=0;i<len;i++)
    {

      System.out.println(str.substring(i));

    }
  }
}