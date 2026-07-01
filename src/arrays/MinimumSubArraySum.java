//Write a program in java to print most minimum sum of sub arrays whose size is k 

package arrays;

public class MinimumSubArraySum {
public static int minSubarraysum(int[] arr, int k) {
	int minsum=Integer.MAX_VALUE;
	for(int i=0;i<=arr.length-k;i++) {
		int sum=0;
		for(int j=i;j<i+k;j++) {
			sum+=arr[j];
		}
		if(sum<minsum) {
			minsum=sum;
		}
	}
	return minsum;
}
public static void main(String[]args) {
	int[] arr= {3,5,2,1,8,4,9};
	int res=minSubarraysum(arr,3);
	System.out.println(res);
}
}
