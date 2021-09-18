package practice;

// Inheritance example
public class Inheritance2 extends Inheritance{
	void sub()
	{
		System.out.println("subtraction is:"+(a-b));
	}
	public static void main(String[] args) 
	{
		System.out.println("Program Started");
		Inheritance2 i2 = new Inheritance2();
		i2.add();
		System.out.println("-----------------------------------");
		i2.sub();
	}

}
