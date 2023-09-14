package moodleAssessment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDiffference {

	public static void main(String[] args) {
		
	Difference 	differ=new Difference();
	differ.largeSmall();
	}

}

class Difference{
	void largeSmall(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=input.nextInt();
		int arr[]= new int [len];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter a value of array:");
			int value=input.nextInt();
			arr[i]=value;
			System.out.println(arr[i]);
		}
		System.out.println("Original Array: "+Arrays.toString(arr)); 
		
		
		int maxvalue=arr[0];
		int minvalue=arr[0];
		
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>maxvalue)
				maxvalue=arr[i];
			else if(arr[i]<minvalue) 
				minvalue=arr[i];
			}
		System.out.println("Difference between the largest and smallest values of the said array: "+ (maxvalue+minvalue));
		}
	}
