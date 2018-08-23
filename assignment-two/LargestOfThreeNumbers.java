import java.util.Scanner;
 
class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner Scan = new Scanner(System.in);
 
      x = Scan.nextInt();
      y = Scan.nextInt();
      z = Scan.nextInt();
 
      if ( x > y && x > z )
         System.out.println("First number is largest.");
      else if ( y > x && y > z )
         System.out.println("Second number is largest.");
      else 
         System.out.println("Third number is largest.");
   }
}