interface Animal
{
	public abstract void speak();
	public abstract void eats();
	
}

class Dog implements Animal
{
	public void speak()
	{
		System.out.println("Dog barks");
	}
	
	public void eats()
	{
		System.out.println("Dog eat's food\n");
	}
}

class Cat implements Animal
{
	public void speak()
	{
		System.out.println("Cat meows");
	}
	
	public void eats()
	{
		System.out.println("Cat eat's food\n");
	}	
}

class Interface
{
	public static void main(String[] args)
	{
		Animal a = new Dog();
		a.speak();
		a.eats();

		a = new Cat();
		a.speak();
		a.eats();
	}
}
