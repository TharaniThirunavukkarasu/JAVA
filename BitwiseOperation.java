package moodleAssessment;

import java.util.Scanner;

public class BitwiseOperation {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter num2:");
		int num2=b.nextInt();
		System.out.println("x&y="+(num1&num2));
		System.out.println("x|y="+(num1|num2));
		System.out.println("x^y="+(num1^num2));
     }

}
