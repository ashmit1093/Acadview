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
		
		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < array1.length; i++) {
 
			if (array1[i] > largest) {
				secondLargest = largest;
				largest = array1[i];
 
			} else if (array1[i] > secondLargest) {
				secondLargest = array1[i];
 
			}
		}

		System.out.println("Second largest numbers is " + secondLargest);
	}
}