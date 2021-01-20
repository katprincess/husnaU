
public class ClassLoaderExamples {

	int a =100;// instance variable
	static int b =200;// static variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class c = ClassLoaderExamples.class;
		System.out.println(c.getClassLoader());
		
		int d =300;// local variable
		ClassLoaderExamples e = new ClassLoaderExamples();
		System.out.println(e.a+" "+b+" "+d);
		
		
		//Unary Operators ++/--
		System.out.println(d++);//stores value
		System.out.println(++d);//will increase the value immediately
		System.out.println(d);// increments value
		
		System.out.println(b--);//stores value
		System.out.println(--b);//gives value
		System.out.println(b);//will show
		
		
		//Unary Operators ~ and !
		int f = 400;
		int f1 = -400;
		boolean f2 = true;
		boolean f3 = false;
		
		System.out.println(~f);//will print the total negative value and implement 1 
		//will change the +ve to -ve and -ve to +ve
		System.out.println(~f1);// will print the total positive number with -1
		//! will give opposite value of boolean
		// true will become false and false true
		System.out.println(!f2);
		System.out.println(!f3);
		
		//Arithmetic Operators + , - , *, /, %
		//like calculator
		System.out.println(b+d);
		System.out.println(b*d);
		System.out.println(b-d);
		System.out.println(b/d);
		System.out.println(b%d);
		
		
		//Logical && and bitwise & (and)
		int x= 10;
		int y= 5;
		int z= 20;
		System.out.println(x < y && y < z);// false and true.// If one is false the entire thing will return false.
		System.out.println(x < y & x < z); // false and true// will return false cuz one is false
		
		//Logical || and bitwise | (or)
		System.out.println(x < y || y < z);// false and true.// If one is true the entire thing will return true.
		System.out.println(x < y | x < z); // false and true// will return true cuz one is true
		
		if(x<y && y<z) {
			System.out.println("and execution");
		}
		if(x<y || x<z) {
			System.out.println("or execution");
		}
		
		//Ternary Operation
		int min = (x<y) ? x:y;// if x<y if true then get me that otherwise the other one  //will return the minimum out of the two. 
		System.out.println(min);
		
		
		//Assignment Operation
		//used to assign values to variables 
		// what is assigned on right side will get stored in left side.
		x+=3;// adding 3 more values to 10;
		System.out.println(x);
			
	}
	
	public int min (int x , int y) {
		if (x<y) {
			return x;
		}
		return y;
	}

}
