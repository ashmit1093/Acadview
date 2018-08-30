class Parent
{
	void display()
	{
		System.out.println("In parent class");
	}
}

class Base extends Parent
{
	
	void display()
	{
		super.display();
		System.out.println("In base class");
	}
}

class Instance_Object
{
	public static void main(String[] args)
	{
		Base b = new Base();
		b.display();
	}
}