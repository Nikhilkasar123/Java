package practice;

//Compiletime polymorphism example 
public class Demo {
	
	 void test()
	 {
		 System.out.println("Running test");
	 }
	 void test(int arg)
	 {
		 System.out.println("Running test(int)");
	 }
	 public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.test();
		d1.test(11);
	}

}
