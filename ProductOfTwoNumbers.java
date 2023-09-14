package moodleAssessment;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		Scanner a=new Scanner (System.in);
		System.out.println("enter a number 1:");
		Integer number1=a.nextInt();
		Scanner b=new Scanner (System.in);
		System.out.println("enter a number 2:");
		Integer number2=b.nextInt();
		System.out.println("sum of two number is:"+ (number1*number2));


	}

}
