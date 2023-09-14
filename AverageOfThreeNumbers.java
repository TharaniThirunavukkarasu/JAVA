package moodleAssessment;

import java.util.Scanner;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number1:");
		Double num1=a.nextDouble();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter a number 2:");
		Double num2=b.nextDouble();
		Scanner c=new Scanner(System.in);
		System.out.println("Enter a number3:");
		Double num3=c.nextDouble();
		System.out.println("Average of three numbers:"+((num1+num2+num3)/3));

	}

}
