abstract class Vehicle
{
	abstract void start();
	
	void stop()
	{
		System.out.println("Stop");
	}
}

class TwoWheeler extends Vehicle
{
	void start()
	{
		System.out.println("Starting two wheeler");
	}
	
	void stop()
	{
		System.out.println("Stopping two wheeler" +"\n");
	}
	
}

class FourWheeler extends Vehicle
{
		void start()
	{
		System.out.println("Starting four wheeler");
	}
	
	void stop()
	{
		System.out.println("Stopping four wheeler"+"\n");
	}
	
}

class Instructions
{
	public static void main(String[] args)
	{
		Vehicle v = new TwoWheeler();
		v.start();
		v.stop();	

		v = new FourWheeler();
		v.start();
		v.stop();
	}
} 