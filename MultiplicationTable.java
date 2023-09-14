package moodleAssessment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a table:");
		Integer table=a.nextInt();
		for(int i=1;i<=10;i++){
		System.out.println(table+"x"+i + "="+(table*i));
			
			}

	}

}
