import java.util.Scanner;

class Pallindrome
{
  public static void  main(String[] args) 
  {
     Scanner s = new Scanner(System.in);
  
    System.out.println("Enter a string"); 

    String str = s.nextLine();
    s.close();

    char[] ch = str.toCharArray();
    int size = ch.length;
    char[] ch2 = new char[size];

    for(int i=size-1;i>=0;)
    {
      for(int j=0;j<size;j++)
      {
        ch2[j] = ch[i];
        i--;
      }
    }

    String str2 = new String(ch2);

    if(str.equalsIgnoreCase(str2))
    {
      System.out.println("It's Pallindrome");
    }
    else
    {
      System.out.println("Not pallindrome");
    }
  }

}