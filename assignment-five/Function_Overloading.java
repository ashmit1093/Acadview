class Print
{
	void print()
	{
		System.out.println("no arguments passed.");
	}
	
	void print(int a)
	{
		System.out.println("When an integer is passed");
	}

	void print(float b)
	{
		System.out.println("When a double is passed");
	}
}

class Function_Overloading
{
	public static void main(String[] args)
	{
		Print p = new Print();
		p.print();
		p.print(2);
		p.print(1.2f); 
	}
}