package moodleAssessment;

import java.util.Scanner;

public class CalculateSalary {

	public static void main(String[] args) {
		 SalaryDetails sal=new  SalaryDetails();
		 sal.Salary1();
	}

}

class SalaryDetails{
	public void Salary1() {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a Salary:");
		Integer salary=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Enter a Shift:");
		Integer shift=a.nextInt();
		if (salary<8000) {
			
			int savings = (int) ((salary*50/100)+(salary*2/100 *shift));
			System.out.println(savings);
		}
		else if(salary>8000){
			System.out.println("Salary too large");
		}
		else if(shift<0){
			System.out.println("Shifts too small");
		}
		else if(salary<0) {
			System.out.println("Salary too small");
		}
	}
}