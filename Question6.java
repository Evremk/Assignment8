package assignment_8;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number");
		int number= sc.nextInt();
		next3(number);

	}

	public static void next3(int number) {
		
		System.out.println("Next 3 are:");
		System.out.println((number+1)+" "+(number+2)+" "+(number+3));
	}

}
