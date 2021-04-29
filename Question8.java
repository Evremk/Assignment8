package assignment_8;

public class Question8 {

	public static void main(String[] args) {
		fib(2);
		 
		
		 
	}

	private static void fib(int count) {
		
		 if(count==1) {
			 System.out.println(0);
			 
		 }else if(count==2) {
			 System.out.println(1);
			 
		 }else {
		 int n1=0,n2=1,n3=0;    
		    
		 for(int i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		     
		  n1=n2;    
		  n2=n3;   
		 }System.out.print(" "+n3); 
		
		
	} 

}}
