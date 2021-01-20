public class SwitchEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		day[] d = day.values();
		
		for (day day: d) {
			switch (day) {
			case mon:
				System.out.println("monday");
				break; // we need break for one output, if we dont have break will repeat
			case sun:
				System.out.println("sunday");
				break;
			default:
				System.out.println("no");
			}
		}
		
		
		
		
		level var = level.medium;
		System.out.println(var);
	}
	
	public enum day{sun, mon, tue}//represents a group of constants (unchangeable variables, like final variable). 
	
	enum level {low, medium, high} //another way of doing enum

}
