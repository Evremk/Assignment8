package assignment_8;

public class Question10 {

	public static void main(String[] args) {
		
		System.out.println(isEven(4));
		System.out.println(isEven(11));
		System.out.println(isEven(5));
		System.out.println(isEven(8));

	}

	public static boolean isEven(int num) {
		
		if(num%2==0) {
			return true;
		}else
			return false;
		
		
	}

}
