package assignment_8;

public class Question14 {

	public static void main(String[] args) {
		
		System.out.println(threeLocks(true,true,false));
		System.out.println(threeLocks(false,true,false));
		System.out.println(threeLocks(false,false,true));
		System.out.println(threeLocks(false,true,true));
		System.out.println(threeLocks(true,true,true));
	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		if(a&&b==true||c==true) {
			return true;
		}else {
			return false;
				
			}
		}
		
		
	}


