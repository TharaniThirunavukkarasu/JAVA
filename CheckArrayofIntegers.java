package moodleAssessment;

import java.util.Arrays;
import java.util.Scanner;

public class CheckArrayofIntegers {

	public static void main(String[] args) {
		
		CheckArray a=new CheckArray();
		a.Check();

	}

}
class CheckArray{
	void Check() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=input.nextInt();
		int arr[]= new int [len];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter a value of array:");
			int value=input.nextInt();
			arr[i]=value;
		
		}
		System.out.println("Original Array: "+Arrays.toString(arr)); 
		System.out.println("Enter a Elements:");
		int key=input.nextInt();
		int flag=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
			flag=1;
			}
		}
		if(flag==1) {
	System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	}
}
