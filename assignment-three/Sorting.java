import java.util.Scanner; 

class Sorting
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
		
		for(int i=0; i<a; i++)
		{
			for(int j=i; j<a; j++)
			{
				if(array1[i]>array1[j])
					{
						int temp = array1[j];
						array1[j] = array1[i];
						array1[i] = temp;
					}
			}
		}	

		for(int i=0; i<a; i++)
		{
			System.out.print(array1[i]+" ");
		}

	}
}