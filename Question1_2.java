package assignment_8;
import java.util.Scanner;

public class Question1_2 {

	public static void main(String[] args) {
		
		
     cube();
    
		

	}


	public static void plus() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = num1+num2;
		System.out.println("result: "+result);
		
		
		
		
	}
	public static void cube() {
		
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int input= scan.nextInt();
		
		int output= input*input*input;
		System.out.println("output:"+output);
	}
}
	

