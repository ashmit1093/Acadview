import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class Toggle
{
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter a string");
    String str = s.nextLine();

    s.close();

    char[] ch = str.toCharArray();

    for(int i=0;i<ch.length;i++)
    {
      if(ch[i]>='a' && ch[i]<='z')
      {
        ch[i]-=32;
      }
      else if(ch[i]>='A' && ch[i]<='Z')
      {
        ch[i]+=32;
      }
    }

    for(int i=0;i<ch.length;i++)
    {
      System.out.print(ch[i]);
    }
    System.out.println("\n");
  }
}