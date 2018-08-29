import java.util.Scanner;
class Waveform
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,j,temp;
        int count=0;
        int[] A=new int[10];
        System.out.println("Enter the elements for an array of size 10");
        for(i=0;i<10;i++)
        {
            A[i]=s.nextInt();
        }
        for(i=0;i<10;i++)
        {
            count++;
            if(count==2)
            {
                temp=A[i-1];
                A[i-1]=A[i];
                A[i]=temp;
                count=0;
            }
        }
        System.out.println("Resultant Array:");
        for(i=0;i<10;i++)
    {
        System.out.println(A[i]);
    }
    }
}