
public class Classtwo {
	//Class can have multiple objects and methods.
	// An object is an instance of a class.
	// we create an object using new keyword.
	// we can create multiple objects of the same class.
	
	private int score;
	
	public void four() {
		score = score + 4;
	}
	
	public void six() {
		score = score + 6;		
	}
	
	public int getscore() {
		return score;
	}
	
	public int seven() {
		return score = score + 7;
	}

	public static void main(String[] args) {
		Classtwo score = new Classtwo();
		score.four();// will print the 4
		System.out.println(score.getscore());
		score.six();// will add 6 + 4 = 10 
		System.out.println(score.getscore());
		score.seven();// 7 here
		System.out.println(score.seven());// 7 + 7 + 6 + 4 = 24		
		
	}

}
