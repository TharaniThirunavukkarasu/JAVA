package moodleAssessment;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Student name:");
		Integer studentname=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("Id:");
		Integer id=a.nextInt();
		Stud std =new Stud();
		std.students_details1();
	}
}
	class Stud{
		
		void students_details1() {
		String studentname="Arun";
		String id="1001";
		System.out.println("Student Name:" + studentname);
		System.out.println("Student ID:"+id);
		}
		void students_details2() {
			String studentname="Ram";
			String id="1002";
			System.out.println("Student Name:" + studentname);
			System.out.println("Student ID:"+id);
			}
		
	}
