//Write a program to find the maximum number of odd elements in the sub array of size k...given array={3,2,1,4,8,7,5,2,3,12} and k=4.

package arrays;

public class MaximumOddElementsSubArray {
public static int countOddElem(int[] arr, int k) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<=arr.length-k;i++) {
		int count=0;
		for(int j=i;j<i+k;j++) {
			if(arr[j]%2!=0)
				count++;
		}
		max=Math.max(count,max);
	}
	return max;
}
public static void main(String[]args) {
	int[] arr= {3,2,1,4,8,7,5,2,3,12};
	int res=countOddElem(arr,4);
	System.out.println(res);
}
}
