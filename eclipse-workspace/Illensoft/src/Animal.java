
public class Animal {
	
	String name;
	String type;
	int age;
	String color;

	public Animal(String name, String type) {// creating a constructor with the class name 
		this.name = name;
		this.type = type;
	}
	
	public String toString() {// if we don't have this then there is no output.
		return "Animal name = " + name + ", Animal type = " + type;
	}
	
	
	//Another method of doing this
	
	public Animal (String name, String type, int age, String color) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
	}
	
	public String getname() {
		return name;
	}
	
	public String gettype() {
		return type;
	}
	
	public int getage() {
		return age;
	}
	
	public String getcolor() {
		return color;
	}

	
	
	
	public static void main(String[] args) {
		//one
		Animal a = new Animal("tommy","cat");
		System.out.println(a);
		
		//two
		Animal b = new Animal ("meow", "cat", 5 ,"brown");
		System.out.println(b.name);
		System.out.println(b.type);
		System.out.println(b.age);
		System.out.println(b.color);
		
		

	}

}
