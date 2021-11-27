package day7_switchStatement;



public class homework7_2 {

	public static void main(String[] args) {
		
		//if balance > 1000 AND accountType == "Saving"
		//code to calculate interest
		//any additional statement
		
		double overdrawnPenalty = 7.0;
	    double interestRate = 0.05;
	    double balance;
	    String accountType = "Saving";
	    
	    System.out.println("Enter your checking account balance : $");
	    balance = 3000;
	    System.out.println("Original balance $"+ balance);
	    
	    if (balance > 1000 && accountType == "Saving") {
	    	balance = balance +(interestRate * balance)/12;
	    	System.out.println("Your new balance is $"+balance);
	    
	    }else {
	    	balance = balance - overdrawnPenalty;
	    System.out.println("Your new balance is $"+balance);
	}
	}

}

