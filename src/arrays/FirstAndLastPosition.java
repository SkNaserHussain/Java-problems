/*
 * Find first and last position of an element in an array.
 */

package arrays;

import java.util.Arrays;
public class FirstAndLastPosition {
public static int[] findPosition(int[] arr, int elem) {
	int start=-1;
	int end=-1;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==elem) {
			start=i;
			break;
		}
	}
	for(int j=arr.length-1;j>=0;j--) {
		if(arr[j]==elem) {
			end=j;
			break;
		}
	}
	return new int[] {start,end};
}
public static void main(String[]args) {
	int[] arr= {3,1,2,1,7,1,8};
	int[] res=findPosition(arr,1);
	System.out.println(Arrays.toString(res));
}
}
