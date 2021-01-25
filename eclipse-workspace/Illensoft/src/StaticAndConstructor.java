
public class StaticAndConstructor {
	
	int count = 0;// since this is non static it will stay the same
	
	static int counting =0; // will have addition. continuous flow
	
	static {
		System.out.println("static block");
	}
	
	StaticAndConstructor (){
		count++;
		System.out.println(count);
		counting++;
		System.out.println(counting);
	}

	public static void main(String[] args) {
		StaticAndConstructor c1 = new StaticAndConstructor(); // all are 1 because they are individual and separate objects. so 1 is repeating, regardless of 4c objects.
		// and because it is non-static
		StaticAndConstructor c2 = new StaticAndConstructor(); // when static is there then it will follow the normal flow
		StaticAndConstructor c3 = new StaticAndConstructor();
		StaticAndConstructor c4 = new StaticAndConstructor();
	}

}
