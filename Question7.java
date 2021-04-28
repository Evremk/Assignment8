package assignment_8;

public class Question7 {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("MERVE"));
		System.out.println(isPalindrome("palindrome"));
		System.out.println(isPalindrome("PAPAP"));
		System.out.println(isPalindrome("1234321"));
		System.out.println(isPalindrome("ANNA"));
		System.out.println(isPalindrome("MADAM"));

	}

	public static boolean isPalindrome(String str) {
		boolean Palindrome=false;
			
			for(int i=0; i<=(str.length()/2)-1;i++) {	

			for(int j=1;j<=str.length()/2;j++) {
				
			if(str.charAt(i)==str.charAt(str.length()-j)) {
				Palindrome= true;
			}else
				Palindrome= false;
			}}
		return Palindrome;
		
	}

}
