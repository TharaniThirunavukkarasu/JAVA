package moodleAssessment;

import java.util.Arrays;

public class ArrayIndex {

	public static void main(String[] args) {
		int[] arr={25,14,56,15,36,56,77,18,29,49};
		Index a=new Index();
		System.out.println("Index position of 25 is:"+ a.findIndex(arr,25));
		System.out.println("Index position of 29 is:"+ a.findIndex(arr,29));
}

}
class Index{
	public static int findIndex(int arr[], int index1) {
	
		for(int i=0;i<=arr.length;i++) {
			if(arr[i]==index1) {
				return i;
			}
			else {
				i=i+1;
			}
		}
		return -1;
		
	}
}

