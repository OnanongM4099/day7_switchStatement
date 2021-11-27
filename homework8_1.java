package day7_switchStatement;

public class homework8_1 {

	public static void main(String[] args) {
		//Switchstatement
		//if bathTemperature <90 {
		//print ("Brrr")
		//}else{
		//if bathTemperature <95 {
		  //print ("That's lukewarm.")
	//}else {
		//if bathTemperature <105 {
		 //print("Perfect!")
		// }else{
		//if bathTemperature <110 {
		 //print("This isn't a hot tub")
		//}else{
		//print("Are you trying to boil a lobster")
		
		int bathTemperature = 99;
		char condition;
		if (bathTemperature<90) { condition='A';}
		else if (bathTemperature<95) { condition='B';}
		else if (bathTemperature<105) { condition='C';}
		else if (bathTemperature<110) { condition='D';}
		else condition = 'E';
		
		//int bathTemperature = 4;
		switch (condition) {
        
	case 'A' : 
		//(bathTemperature < 90 ); 
		System.out.println("Brrr");
	break;
	
	case 'B': 
    //(bathTemperature < 95 ):
		System.out.println("That's lukewarm");
    break;
    
	case 'C':	
	//(bathTemperature < 105 ):
	    System.out.println("This isn't a hot tub");
	break;
	
	case 'D':
	//(bathTemperature < 110):
		    System.out.println("Perfect");
    break;
    
	case 'E':
	 
    default:
	System.out.println("Invalid input");
}
}
}
