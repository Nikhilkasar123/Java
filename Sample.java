package practice;

// constructor example
public class Sample {
	int k;
	double d;
	Sample(int arg1, double arg2){
		System.out.println("Running sample constructor");
		k = arg1;
		d = arg2;
	}
	public static void main(String[] args) {
		Sample s1 = new Sample(11,11.12);
		System.out.println("k ka value :"+ s1.k);
		System.out.println("d ka value :"+ s1.d);

	}

}
