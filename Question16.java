package assignment_8;

public class Question16 {

	public static void main(String[] args) {
		
		System.out.println(simpleRoomBook(false,2,1,2018));
		System.out.println(simpleRoomBook(true,2,1,2018));
		System.out.println(simpleRoomBook(true,7,2,2018));
		System.out.println(simpleRoomBook(true,7,11,2019));
		

	}

	public static boolean simpleRoomBook(boolean available, int day, int month, int year) {
		
		if(year==2018&&available==true) {
			
			
			if((month>8 && month<=12) && (day>0&&day<=31)) {
				return true;
			}else if(month==1 && day>0 && day <7) {
				return true;
			}else if(month==8 && day>7&& day<=31) {
				return true;
			}else {
				return false;
			}
				
			
		}else {
			return false;
		}
		
		
	}

}
