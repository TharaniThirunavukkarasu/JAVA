package moodleAssessment;

import java.util.Scanner;

public class AreaPerimeterOfCircle {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a radius:");
		double radius=a.nextDouble(); 
		double perimeter=2*Math.PI*radius;
		double area=Math.PI*radius*radius;
		
		System.out.println("Perimeter is "+ perimeter);
		System.out.println("Area is "+area);

	}

}
