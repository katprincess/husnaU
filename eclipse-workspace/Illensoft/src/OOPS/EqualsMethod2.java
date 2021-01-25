package OOPS;

public class EqualsMethod2 {
	
private int id;
	
	public EqualsMethod2(int id) {
		this.id = id;
	}
	
	@Override   // need to add this method so the equals look at the content of the object rather than just the object
	public boolean equals(Object obj) { 
		// value x, x.equals(x) returns true
		// value x and y, x.equals(y) returns true if and only if y.equals(x) returns true
		// value x, y and z, x.equals(y) returns true and y.equals(z) returns true. Then x.equals(z) return true.
		// values x, y and z multiple invocations of x.equals(y) consistently return true or consistently return false, if no info used in equals is modified.
		// x.equals(null) should return false
		
		if(this == obj){
			return true;
		}
		if (obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		EqualsMethod2 other = (EqualsMethod2) obj;
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
		

		EqualsMethod2 one = new EqualsMethod2(25);
		EqualsMethod2 two = new EqualsMethod2(25);
		EqualsMethod2 three = one;
		
		System.out.println(one == two);//since they are two diff objects it will return false 
		
		System.out.println(one == three);//since referring to the same object will return true
		
		// similar to == 
		System.out.println(one.equals(two)); // false   // after adding the override method, it checks the content of the object. so it returns true.
		
		System.out.println(one.equals(three)); // true
	}

}
