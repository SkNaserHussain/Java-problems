/*
 * Write a java program to find the longest sub array whose sum is less than equal to x...Given array 3 1 2 1  1 5 and x=5.
 */

package arrays;

public class longestSubArraySumLessThanEqualToX {
public static int longestSubArray(int[] arr, int x) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=i;j<arr.length;j++) {
			sum+=arr[j];
			if(sum<=x) {
				int len=j-i+1;
				max=Math.max(max, len);
			}
		}
	}
	return max;
}
public static void main(String[]args) {
	int[] arr= {3,1,2,1,1,5};
	int res=longestSubArray(arr,5);
	System.out.println(res);
}
}
