package moodleAssessment;

import java.util.Scanner;

public class ScannerSumoperation {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter nummber1");
		Integer num1=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter nummber2");
		Integer num2=a.nextInt();
		System.out.println("sum of two numbers:"+(num1+num2));

	}

}
