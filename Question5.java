package assignment_8;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		
	sign(number);
	
	}

	public static void sign(int number) {
		
		int status;
		if(number>0) {
			status=1;
		}else if (number<0) {
			status=-1;
		}else {
			status=0;
		}
		System.out.println(status);
	}

}
