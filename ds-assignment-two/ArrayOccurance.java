import java.util.Scanner;
public class ArrayOccurance
{
  public static void main(String[] args)
  {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter size of array:");
      
      int n=s.nextInt();
      int[] array=new int[n];

      System.out.println("Enter elements in array");

      for(int i=0;i<n;i++)
      {


        array[i]=s.nextInt();
      }

      System.out.println("Enter the element you want to search :");

      int element=s.nextInt();

      s.close();

      boolean isPresent=search(array,element,array.length);

      if(isPresent)
      {
        System.out.println(+ element + "is present:");
      }
      else
      {
        System.out.println(+ element + " Element is not present");
      }
  }

  static boolean search(int[] arr,int element,int length)
  {
    if(length==0)
    {
      return false;
    }
    else if(arr[length-1]==element)
    {
      return true;
    }

    return search(arr,element,length-1);
  }
}