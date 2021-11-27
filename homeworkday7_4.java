package day7_switchStatement;

public class homeworkday7_4 {

	public static void main(String[] args) {
		// Multiple Branches
		// If supermaket has full-fat milk buy full fat milk
		// Else
		// If supermarket has 2% milk buy 2% milk
		// Else
		// buy skimmed milk
		// End
		// End

		boolean fullfatmilk = false;
		boolean twopercentmilk = false;

		if (fullfatmilk) {
			System.out.println("I want to buy fullfatmilk");
		} else if (twopercentmilk == true) {
			System.out.println("I want to buy twopercentmilk too");

		} else {
			System.out.println("I want to buy skimmed milk");
		}
	}
}