package day7_switchStatement;

import java.util.Scanner;

public class LearnScannerObject {

	public static void main(String[] args) {
		
		//int score = 90;
		
		
		Scanner bella = new Scanner(System.in);// Scanner object
		
		System.out.println("Please enter the score");

		int score = bella.nextInt();
		
		System.out.println("Your score is "+score);
		
		bella.close();
		
		
		
		
		

	}

}
