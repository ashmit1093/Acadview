import java.util.Scanner;
public class Fibonaci
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the value of n : ");
        int n = s.nextInt();

        s.close();

        for(int i=0;i<n;i++)
        {
        System.out.println(fibo(i));
        }
         
    }
    public static int fibo(int n)
    {
        if(n==0)
        {   
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
      return fibo(n-1)+fibo(n-2);
         
    }
 
}