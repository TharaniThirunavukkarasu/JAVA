package moodleAssessment;

import java.util.Scanner;

public class SwapTwoVariables {

	public static void main(String[] args) {
		int temp;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter X1:");
		Integer x1=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter Y1:");
		Integer y1=b.nextInt();
		temp=x1;
		x1=y1;
		y1=temp;
		System.out.println("swap of two numbers:" + x1+" " + y1);
		}

}
