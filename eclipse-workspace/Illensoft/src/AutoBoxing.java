
public class AutoBoxing {

	public static void main(StringSting[] args) {
		// TODO Auto-generated method stub
		Integer ten = new Integer(10);
		ten++;
		System.out.println(ten);
		
		//Auto Boxing
		//two wrapper objects created using new are not same objects
		
		Integer a = new Integer(9);
		Integer a1 = new Integer(9);
		System.out.println(a == a1); //false
		System.out.println(a.equals(a1)); //true
		
		//two wrapper objects created using boxing are same objects.
		
		Integer b = 9;
		Integer b1= 9;
		System.out.println(b == b1);//true
		System.out.println(b.equals(b1));//true
		
		
		
	}

}
