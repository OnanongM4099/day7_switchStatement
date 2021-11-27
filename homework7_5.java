package day7_switchStatement;

public class homework7_5 {

	public static void main(String[] args) {

		// If it's on sale AND expiration date > 2 weeks ahead buy two gallons full fat
		// milk
		// else
		// buy one gallon full fat milk
		// End
		// Else
		// If they have 2% milk buy 2% milk
		// Else buy skimmed milk
		// End
		// End

		int expirationdate = 15;
		boolean onsale = true;
		boolean fullfatmilk = false;
		boolean twopercentmilk = false;

		if (fullfatmilk == true) {
			if (onsale == true && expirationdate >= 15==true) {
				System.out.println("I want to buy two gallons full fat milk");

			} else {
				System.out.println("I want to buy one gallon full fat milk");}
			
		}else
	    if (twopercentmilk == true) {
				System.out.println("I want to buy twopercent milk");
			} else {
				System.out.println("I will buy skimmed milk ");
			}
			
		

	}	

}
