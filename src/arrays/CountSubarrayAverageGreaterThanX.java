//Write a program in java to find the count of sub array of size k whose average is greater than x...Given array={2,1,5,1,3,2} and k=3 and x=2.
package arrays;

public class CountSubarrayAverageGreaterThanX {
public static int subArrayAvg(int[] arr, int k, int x) {
	int count=0;
	for(int i=0;i<=arr.length-k;i++) {
		double sum=0;
		for(int j=i;j<i+k;j++) {
			sum+=arr[j];
		}
		double avg=sum/k;
		if(avg>x)
			count++;
	}
	return count;
}
public static void main(String[]args) {
	int[] arr= {2,1,5,1,3,2};
	int res=subArrayAvg(arr,3,2);
	System.out.println(res);
}
}
