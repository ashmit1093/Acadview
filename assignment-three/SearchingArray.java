import java.util.Scanner;

class SearchingArray
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int[] array1 = new int[]{1,4,6,7,8,9,10};

		System.out.println("Enter the number you want to search in array : ");
		
		int a = s.nextInt();
		int flag = 0; 

		for(int i=0; i<array1.length; i++ )
		{
			if(array1[i] == a)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("Number is present");
		}
		else
		{
			System.out.println("Number is not present");
		}
	}
}