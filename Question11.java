package assignment_8;

public class Question11 {

	public static void main(String[] args) {
		
		System.out.println(c_profis(400,300)); 

	}

	public static String c_profis(int buyPrice, int sellPrice) {
		
		if(sellPrice-buyPrice>0) {
			return "profit";
		}else if(sellPrice-buyPrice<0) {
			return "loss";
		}else {
			return "no loss";
		}
		
		
	}

}
