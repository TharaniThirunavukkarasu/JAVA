package moodleAssessment;

import java.util.Scanner;

public class DivisionOfTwoNumbers {

	public static void main(String[] args) {
		Scanner num1=new Scanner(System.in);
		System.out.println("enter a number1:");
		Float numerator=num1.nextFloat();
		Scanner num2=new Scanner(System.in);
		System.out.println("enter a number2:");
		Float denominator=num2.nextFloat();
		System.out.println("Division of two numbers:"+(numerator/denominator));
		

	}

}
