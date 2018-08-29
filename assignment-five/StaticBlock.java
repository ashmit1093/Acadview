class StaticBlock
{
	static int num;
	static String mystr;
	
	static{
		
		num = 68;
		mystr = "block1";
	}
	
	static{
		num = 70;
		mystr = "Block 2";
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("value of num is "+num);
		System.out.println("value of myster is "+mystr);
	}
}