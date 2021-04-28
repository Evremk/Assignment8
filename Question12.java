package assignment_8;

public class Question12 {

	public static void main(String[] args) {
		
		System.out.println(hamletQuote(false,false));   
		System.out.println(hamletQuote(true,false)); 
		System.out.println(hamletQuote(false,true)); 
		System.out.println(hamletQuote(true,true)); 

	}

	private static boolean hamletQuote(boolean eins, boolean zwei) {
		
		if((eins||zwei)==true) {
			return true;
		
		}else 
			return false;
	}

}
