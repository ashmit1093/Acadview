import java.util.Scanner;
class Words
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);

    System.out.println("Enter string");

    String str =s.nextLine();
    int count=1;

    s.close();
    
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)==' ')
      {
      count++;
      }
    }

    System.out.println("Word count is " + count);

  }

}