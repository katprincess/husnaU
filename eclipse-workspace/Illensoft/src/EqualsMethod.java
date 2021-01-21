
public class EqualsMethod {
	
	private int id;
	
	public EqualsMethod(int id) {
		this.id = id;
	}
	
	@Override   // need to add this method so the equals look at the content of the object rather than just the object
	public boolean equals(Object obj) { 
		EqualsMethod other = (EqualsMethod) obj;
		if(id != other.id) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// used when comparing two objects
		//similar to == operator
		// == will only check if the object references are pointing to the same object. It does not look at the content of the object.
		//two object references are equal only if they are pointing to the same object.
		// we need to override equals method, if we want to compare the contents of the object.
		

		EqualsMethod one = new EqualsMethod(25);
		EqualsMethod two = new EqualsMethod(25);
		EqualsMethod three = one;
		
		System.out.println(one == two);//since they are two diff objects it will return false 
		
		System.out.println(one == three);//since referring to the same object will return true
		
		// similar to == 
		System.out.println(one.equals(two)); // false   // after adding the override method, it checks the content of the object. so it returns true.
		System.out.println(one.equals(three)); // true
	}

}
