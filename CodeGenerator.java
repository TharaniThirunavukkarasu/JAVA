package moodleAssessment;

import java.util.Random;
import java.util.Scanner;

public class CodeGenerator {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("Enter a number:");
		Integer number=num.nextInt();
		 CodeGenearate gener=new  CodeGenearate();
		 gener.a(number);
	}

}

class CodeGenearate{


	void a(int number) {
		
		
		if(number<32767) {
			Random random = new Random();
			int rand=random.nextInt((100-2)+1);
			System.out.println(rand);
		}
		
	else if(number<0) {
		System.out.println("Number too small");

	}
	else if(number>32767){
		System.out.println("Number too large");
	}
	else if(number==0){
		System.out.println(" coupon does not contain any even numbers.");
	}
	else {
		System.out.println("");
	}
}}