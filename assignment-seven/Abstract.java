abstract class Animals
{
	String color,breed,name;
	abstract void Eat(String color,String name,String breed);
	
	void speaks()
	{
		System.out.println("In speak method of Animal");
	}
}

class dogs extends Animals
{
	void Eat(String c , String n ,String b )
	{
		color = c;
		name = n;
		breed = b;
		
		System.out.print("Color of my dog is " + color +" his name is " + name + 			" breed is " + " " + breed +" " );
		System.out.println("he eats food");
		
	}
	void speaks()
	{
		System.out.println("Dog barks");
	}
}

class Abstract
{
	public static void main(String[] args)
	{
		Animals a = new dogs();
		a.Eat("black","coco","beagle");
		a.speaks();
	}
}