package moodleAssessment;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]={1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
		System.out.println("original array:"+ Arrays.toString(arr));
		System.out.println("reverse array:");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
