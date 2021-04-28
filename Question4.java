package assignment_8;

public class Question4 {

	public static void main(String[] args) {
		
		printHollowRect();

	}

	public static void printHollowRect() {
		
		int row=5;
		int column=5;
	
		for(int j=1; j<column; j++) {
			
		if(j==1) {
			System.out.println("*****");
		
		}else if(j==column-1) {
				System.out.println("*****");
				break;
			}else {
				System.out.print("");
	
		}
		
		for(int i=1;i<=row;i++) {
			
			if(i==1||i==row) {
			System.out.print("*");
			}else {
				System.out.print(" ");
				
			}}
			System.out.println();
			
		}
	}}
	
	
			

				
		
	
	

