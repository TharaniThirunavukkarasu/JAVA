package moodleAssessment;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {
		int m,n,a,b;
		Scanner a1=new Scanner(System.in);
		System.out.println("number of rows of matrix");
		 m=a1.nextInt();
		 System.out.println("number of columns of matrix");
		 n=a1.nextInt();
		 
		int array1[][]=new int[m][n];
		int array2[][]=new int[m][n];
		int sum[][]=new int[m][n];
		
		System.out.println("Input Elements of first matrix:");
		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++) {
				array1[c][d] = a1.nextInt();
			}
		}
		System.out.println("Input Elements of second matrix:");
		
		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++) {
				array2[c][d] = a1.nextInt();
			}
		}

		for (int c = 0 ; c < m ; c++ ) {
	         for ( int d = 0 ; d < n ; d++ ) {
	              sum[c][d] = array1[c][d] + array2[c][d]; 
	 
	         }}
		
	      System.out.println("Sum of the matrices:-");
	      for (int c = 0 ; c < m ; c++ )
	      {
	         for ( int d = 0 ; d < n ; d++ ) {
	            System.out.print(sum[c][d]+"\t");
	           
	         }
	         System.out.println("");
	         }
	   
	      }
	   
	}


