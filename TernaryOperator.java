package moodleAssessment;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter a number1:");
	Integer num1=a.nextInt();
	
	Scanner b=new Scanner(System.in);
	System.out.println("Enter a number2:");
	Integer num2=b.nextInt();
	int result;
	result=(num1>num2)?num1:num2;
	System.out.println(result);

	}

}
