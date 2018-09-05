final class animal
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