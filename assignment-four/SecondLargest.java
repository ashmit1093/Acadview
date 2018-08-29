import java.util.Scanner;
import java.util.Arrays; 

class SecondLargest
{
	public static void main(String[] args)
	{
		System.out.println("Enter size of array : ");

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
	
		int[] array1 = new int[a];

		System.out.println("Enter elements in array");	

		for(int i=0; i<a; i++)
		{
			array1[i] = s.nextInt();
		}
		
		Arrays.sort(array1);
		
		System.out.println("After sorting");	

		for(int i=0; i<a; i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.println("\n");

    
		System.out.println("Second largest element is : "+ array1[a-2]);
		
		s.close();
   

	}
}