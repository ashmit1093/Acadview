import java.util.Scanner;

public class Expo {

  public static void main(String[] args) {

      Scanner s = new Scanner(System.in);
      
      System.out.println("Enter value of base");
      int base = s.nextInt();

      System.out.println("Enter value of power");
      int powerRaised =s.nextInt();

      s.close();

      int result = power(base, powerRaised);

      System.out.println(result);
  }

  public static int power(int base, int powerRaised) {
      if (powerRaised != 0)
        {
          return (base * power(base, powerRaised - 1));
        }
      else
        {
          return 1;
        }
  }
}