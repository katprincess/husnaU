
public class WrapperClass {

	public static void main(StringSting[] args) {
		// A wrapper class wraps (encloses) data type and gives it an object appearance
		
		Integer number = new Integer(55);//int
		Integer number2 = new Integer ("55"); //String
		Double number3 = new Double(55.0); //Double
		Float number4 = new Float(55.09f); //Float
		String number5 = new String("love"); //String
		Character c1 = new Character('C'); //character
		Boolean b1 = new Boolean(true); //Boolean
		Boolean b2 = new Boolean(false); //Boolean
		
		//Providing value and creating a wrapper class
		Integer a1 = Integer.valueOf(100); // 100 is stored in variable a1
		Integer a2 = Integer.valueOf("1000"); // 1000 stored as string in variable a2
		Integer a3 = Integer.valueOf("100", 4); // string and int//binary
		String a4 = String.valueOf("hello love"); //String
		Boolean a5 = Boolean.valueOf(true);
		Boolean a6 = Boolean.valueOf("boolean true");
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(c1);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);

	}

}
