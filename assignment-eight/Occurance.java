import java.util.Scanner;
class Occurance
{
  public static void main (String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter string");	
    String str = s.nextLine();

    System.out.println("Enter string you want to find");

    String str2=s.nextLine();

    s.close();

    int c=-1;
    c=str.lastIndexOf(str2);

    if(c>=0)
    {  
      System.out.println("Yes,substring occurs in main string");
    }

    else
    {
      System.out.println("No,substring doesn't occurs in main string");

    }
  }
}
