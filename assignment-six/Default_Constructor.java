class call
{
	call()
	{	
		
		System.out.println("hello a");
	}
	
	call(int X)
	{
		this();
		System.out.println(X);
	}
}

class default_Constructor
{
	public static void main(String[] args)
	{
		call c = new call(10);
	}
}