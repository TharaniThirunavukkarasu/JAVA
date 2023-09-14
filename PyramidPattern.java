package moodleAssessment;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter n:");
		Integer n=a.nextInt();
		for (int i=0; i<n; i++)
        {	
			for (int j=n-i; j>1; j--)
            {
 
                System.out.print(" ");
            }
			for (int j=0; j<=i; j++ )
            {
				
                System.out.print("* ");
            }
			 System.out.println();
	  }

}

	private static Integer nextInt() {
		// TODO Auto-generated method stub
		return null;
	}
}