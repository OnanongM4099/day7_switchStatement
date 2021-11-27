package day7_switchStatement;

public class homework7_3 {

	public static void main(String[] args) {
		//if cartTotal > 100 OR memberType == "Premium"
		//print("You qualify for free shipping!")
		//shippingCost = 0
		
		String memberType = "Premium";
		
		int shippingCost = 0;
		
		int cartTotal = 777;
		
		if (cartTotal > 100 || memberType == "Premium") {
		System.out.println("You qualify for free shipping !");
		
		}else {	
	    System.out.println("It's not for free shipping");
		}
	}
}


