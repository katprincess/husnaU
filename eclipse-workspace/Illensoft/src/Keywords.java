
public class Keywords {

	public static void main(String[] args) {
		//keywords
		// everything that is bold and colored that are the keywords.
		
		boolean value = false;
		
		for(int i=0; i<10; i++) {
			System.out.println("i"+i);
			
			if(i==5) {
				System.out.println("before break "+i);
				break;//stops the flow of execution
			}
			else {
				System.out.println("continue" +i);
			}
		}
		System.out.println("next line");

	}

}
