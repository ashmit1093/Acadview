/*
	if we use final class animal 
	then cat cannot inherit animal class.

	Example:-
	
	final class animal 
	{
	
	}
	class cat extends animal
	{

	}
		
		ERROR - MESSAGE ->"cannot inherit from final animal
												class cat extends animal."
*/

class animal
{
	void display()
	{
		System.out.println("IN ANIMAL CLASS");
	}
}
class cat extends animal
{
	void display()
	{
		System.out.println("In cat class");
	}
}

class Final_class
{
	public static void main(String[] args)
	{
		cat c = new cat();
		c.display();
	}
} 