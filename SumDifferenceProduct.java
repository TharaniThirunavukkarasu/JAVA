package moodleAssessment;

import java.util.Scanner;

public class SumDifferenceProduct {

	public static void main(String[] args) {

		Scanner a=new Scanner(System.in);
		System.out.println("Input 1:");
		Integer input1=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Input 2:");
		Integer input2=b.nextInt();
		System.out.println("Sum of two integers:"+(input1+input2));
		System.out.println("Difference of two integers:"+(input1-input2));
		System.out.println("Product of two integers:" +(input1*input2));
		System.out.println("Average of two integers:" +(Math.floor((input1+input2)/2)));
		System.out.println("Distance of two integers:"+(input1-input2));
		System.out.println("Max integers:"+(Math.max(input1,input2)));
		System.out.println("Min integers:"+(Math.min(input1,input2)));
	}

}
