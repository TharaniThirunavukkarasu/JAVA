package moodleAssessment;

import java.util.Scanner;

public class DisplayPattern {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.print("Enter a n:");
		Integer n=a.nextInt();
		int i,j;
	for(i=1;i<=n;i++) {
		for(j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}

}
