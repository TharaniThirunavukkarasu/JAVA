package moodleAssessment;

import java.util.Scanner;

public class NumIsPositive {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number:");
		Integer num1=a.nextInt();
		if(num1>=0) 
		{
			System.out.println("Number is positive");
		}

	}

}
