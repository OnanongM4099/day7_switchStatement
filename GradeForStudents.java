package day7_switchStatement;

import java.util.Scanner;

public class GradeForStudents {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your score!");

				//int score = 65 ;
				
				int score = scan.nextInt();

				char grade = ' ';
//				  0 <= score <= 100
				if (score >= 0 && score <= 100) {
//					  90 <= score <= 100
					if (score >= 90 && score <= 100) {
						grade = 'A';
					}

//					  80 <= score < 90
					if (score >= 80 && score < 90) {
						grade = 'B';
					}

//					  70 <= score < 80
					if (score >= 70 && score < 80) {
						grade = 'C';
					}
//					  60 <= score < 70
					if (score >= 60 && score < 70) {
						grade = 'D';
					}

//					  0 <= score < 60
					if (score >= 0 && score < 60) {
						grade = 'F';
					}

					System.out.println("Your score is " + score + " ,grade is " + grade);

				} else {
					System.out.println("Invalid score!!");
				}

				scan.close();
				
				}

}
