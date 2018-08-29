import java.util.Scanner;

class Rectangle
{
	double length, height;

	Rectangle(double l , double h)
	{
		length = l;
		height = h;
	}

	void calculateArea()
	{
		System.out.println("Area of rectangle is :" + (length*height));
	}
	
}

class MainRectangle
{
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		System.out.println("enter value of length and height");

		double len = s.nextDouble();
		double ht = s.nextDouble();

		s.close();

		Rectangle r = new Rectangle(len,ht);
		r.calculateArea();
	}
	
}