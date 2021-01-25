package OOPS;

public class TypePromotionOverload extends OverloadingCalculation {
	
	void sum(int a, long b) {
		System.out.println(a+b);
	}
	void sum (int a, long b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
	
		TypePromotionOverload aa = new TypePromotionOverload();
		aa.sum(10,30);// since there is long the second will be automatically be converted to long
		aa.sum(44, 44, 44); // second int will be automatically be converted to long
		

	}

}

class OverloadingCalculation{
	
	void sum (int a , int b) {
		System.out.println("int method");
	}
	void sum (long aa, long bb) {
		System.out.println("long method");
	}
	public static void main(String[]args) {
		OverloadingCalculation cc = new OverloadingCalculation();
		cc.sum(20,35);
	}
}
