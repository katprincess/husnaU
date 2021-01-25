package OOPS;

public class HashCodeExamples {
	private int id;

	public static void main(String[] args) {
		// hashcodes are used to decide which group or bucket an object should be placed into. A group of objects might share the same hashcode.
		// hash code methods
		// if obj1.equals(obj2) true, then obj1.hashCode() should be equal to obj2.hashCode();
		// obj.hashCode() should return the same value when run multiple times, if the value of obj used in equals() has not changed.
		// if obj1.equals(obj2) false, its not required that obj1.hashCode() is not equal to obj2.hashCode(). 
		// Two unequal objects might have the same hashCode
		
		String s = "lillypopop";
	//	String b = "lillypopop";
		String b = "maya";
		System.out.println(s.equals(b));
		System.out.println(s.hashCode());
		System.out.println(b.hashCode());
		
		HashCodeExamples aa = new HashCodeExamples();
		System.out.println(aa.hashCode(55));

	}
	public int hashCode(int id){
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

}
