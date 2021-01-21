
public class ToStringExample{

	public static void main(String[] args) {
		
		String s ="lillypop";
		System.out.println(s.toString());// will print the contect of the object
		
		s = "mine"; //overridding it
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		System.out.println(s.concat("likil"));
		
	}

}

