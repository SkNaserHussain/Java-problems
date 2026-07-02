/*
 * Write a code in java to find the smallest sub array whose sum greater is equal to x...Given array 2 1 5 2 3 2 and x=7. 
 */   
 
package arrays;

public class SmallestSubArraySumGreaterEqualToX {
public static int smallestSubArray(int[] arr, int x) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=i;j<arr.length;j++) {
			sum+=arr[j];
			if(sum>=x) {
				int len=j-i+1;
				min=Math.min(min, len);
				break;
			}
		}
	}
	return min;
}
public static void main(String[]args) {
	int[] arr= {2,1,5,2,3,2};
	int res=smallestSubArray(arr,7);
	System.out.println(res);
}
}
