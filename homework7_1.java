package day7_switchStatement;

import java.util.Scanner;

public class homework7_1 {

	public static void main(String[] args) {
		
		//Create a basic calculator using if else statement.
		//Note: Create a String variable name it operator. 
		//Create 3 numeric variable, total, num1 and num2 and perform basic calculation. 
		
		String operator;
		int num1,num2,num3;
		
		Scanner bella = new Scanner(System.in);
		System.out.println("Enter First Lucky Number");
		num1 = bella.nextInt();
		
		System.out.println("Enter Second Lucky Number");
		num2 = bella.nextInt();
		
		System.out.println("Enter operator + - * /");
		operator = bella.next();
		
		if(operator.equals("+")) {num3 = num1 + num2;
		System.out.println(num1 +" "+ operator +" "+ num2 + "="+num3);
		}
		else if(operator.equals("-")) {num3 = num1 - num2;
		System.out.println(num1 +" "+ operator +" "+ num2 + "="+num3);
		}
		else if(operator.equals("*")) {num3 = num1 * num2;
		System.out.println(num1 +" "+ operator +" "+ num2 + "="+num3);
		}
		else if(operator.equals("/")) {num3 = num1 / num2;
		System.out.println(num1 +" "+ operator +" "+ num2 + "="+num3);
		}
		else
			System.out.println("Invalid");
		
		bella.close();
		
		}
	
     
	  
	 
		 
	 }
	 
	

	


