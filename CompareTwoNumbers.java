package moodleAssessment;
import java.util.Scanner;
public class CompareTwoNumbers {

	public static void main(String[] args) {
		Scanner num1=new Scanner(System.in);
		System.out.println("Enter a first number:");
		Integer firstnumber=num1.nextInt();
		Scanner num2=new Scanner(System.in);
		System.out.println("Enter a second number:");
		Integer secondnumber=num2.nextInt();
		if((firstnumber!=secondnumber)||(firstnumber<=secondnumber) || (firstnumber<secondnumber)) {
			System.out.println(firstnumber+"!="+secondnumber);
			System.out.println(firstnumber+ "<"+ secondnumber);
			System.out.println(firstnumber+ "<="+secondnumber);
		}
		
		
	}

	}


