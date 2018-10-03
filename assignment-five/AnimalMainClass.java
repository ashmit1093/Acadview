class Animal
{
	String breed;
	String color;

	Animal()
	{

	}

	Animal(String b , String c)
	{
		breed = b;
		color = c;
	}
	
	void speakFunction()
	{
		System.out.println("Animal speaks");
	}
}

class Dog extends Animal
{	
	
	Dog(String b , String c)
	{
		breed = b;
		color = c;
	}
	
	void speakFunction()
	{
		System.out.println("Dog barks");
	}
}

class Cat extends Animal
{
	
		Cat(String b , String c)
	{
		

		breed = b;
		color = c;
	}


	void speakFunction()
	{
		System.out.println("Cat meows");
	}
}

class AnimalMainClass
{
	public static void main(String[] args)
	{
		Dog d = new Dog("Beagle","Brown");
		System.out.println("Breed of dog is " + d.breed);
		System.out.println("Color of dog is " + d.color);
		d.speakFunction();

		System.out.println("\n");

		Cat C = new Cat("Persian","White");
		System.out.println("Breed of cat is " + C.breed);
		System.out.println("Color of cat is " + C.color);
		C.speakFunction();
		
	}
}