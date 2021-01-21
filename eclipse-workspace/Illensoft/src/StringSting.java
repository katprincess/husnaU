
public class StringSting {

	public static void main(String[] args) {
		// once a string object has been created it can't be modified
		
		String s = "love";
		System.out.println(s);
		
		s.concat("everyone");//did not concat because once object created then cant modify
		System.out.println(s);
		
		String concat = s.concat(" everyone");// works because we created a new variable 
		System.out.println(concat);
		
		//should be careful with string concat in loops
		String a = "one";
		String b = "two";
		for (int i=0 ; i<3; i++) {
			b = b+a;
			System.out.println(b);
		}
		
		//another way to concat
		StringBuffer sb = new StringBuffer(" cat mat sat");
		String sb2 = "eat";
		
		for (int i=0; i<3; i++) {
			sb.append(sb2);
			System.out.println(sb);
		}

	}

}
