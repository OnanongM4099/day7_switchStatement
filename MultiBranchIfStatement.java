package day7_switchStatement;

import java.util.Scanner;

public class MultiBranchIfStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Plese enter your score:");
		
		//int score = 90;
		int score = scan.nextInt();
		char grade;
		
		if(score >= 0 && score <= 100) {
			
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score < 90) {
			grade = 'B';
		}else if(score >= 70 && score < 80) {
			grade = 'C';
		}else if(score >= 60 && score < 70) {
			grade = 'D';
		}else {
			grade = 'F';
					
		}
		System.out.println("Your score is "+score);
		System.out.println("Your grade is "+grade);
			
		}else {
			System.out.println("Invalid score!");
		}
      
		scan.close();
     
     
	}
}


