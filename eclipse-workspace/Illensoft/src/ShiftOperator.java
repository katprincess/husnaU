
public class ShiftOperator {

	public static void main(String[] args) {
		//left shift
		int a= 5; // Binary 0101
		int b= -10;
		//0000 0101<<2 = 0001 0100(20)
		// similar to 5*(2^2)
		
		System.out.println("a<<2= "+(a<<2));
		System.out.println(5<<2);// 5*2^2 = 5*4 =20
		System.out.println(10<<2); // 10*2^2 = 10*4 = 40 // 2 is the number of times it is specified 
		System.out.println(15<<4);// 15*2^4 = 15*(2x2x2x2)/ 15*4^4 = 15*16 = 240
		
		//right shift
		// 0000 0101>>2 = 0000 0001(1)
		// similar to 5/(2^2)
		
		System.out.println("b>>2= "+ (b>>2));// -10/2^2 = -10/4 = -3
		System.out.println(5>>2); // 5/2^2= 5/4 =1.25
		System.out.println(10>>2);// 10/2^2 = 10/4 = 3
		System.out.println(15>>4);// 15/2^4 = 15/(2x2x2x2)= 15/16 = 0.93
	}

}
