package moodleAssessment;

import java.util.*;

public class AscendingOrder {

	public static void main(String[] args) {
		int arr[]=new int[] {56,7,21,98,74,120,23};
		Arrays.sort(arr);
		System.out.println("The sorted array is:");
		for(int i=0;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
}
}