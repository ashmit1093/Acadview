import java.util.Scanner;
import java.lang.Math;
class Armstrong
{
        public static void main(String[] args)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter a number");
            int num=s.nextInt();
            int m=100,n=num;
            int count=0,arm=0;
            while(n>0)
            {
                m=n%10;
                count++;
                n=n/10;
            }
            n=num;
            while(n>0)
            {
                m=n%10;
                arm+=Math.pow(m,count);
                n=n/10;
            }
            if(num==arm)
            {
                System.out.println(num+" is an Armstrong number");
            }
            else
            {
                System.out.println(num+" is not an Armstrong number");
            }
        }
}