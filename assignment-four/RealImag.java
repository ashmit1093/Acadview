import java.util.Scanner;

class Complex
{
	int real;
	int imaginary;
	
	Complex(int r , int i)
	{
		real = r;
		imaginary = i;
	}
	
	void display()
	{
		System.out.println("Complex number is :"+real + "+" + imaginary +"i");
	}
}

class RealImag
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter real and imaginary part: ");
	
		int a = s.nextInt();
		int b = s.nextInt();
	
		Complex c = new Complex(a,b);
		c.display();
	}
}