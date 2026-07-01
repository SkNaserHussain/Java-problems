package Array;

public class SubArraySumK {
public static void subArraysum(int[] arr,int k) {
	for(int i=0;i<=arr.length-k;i++) {
		int sum=0;
		for(int j=i;j<i+k;j++) {
			sum+=arr[j];
		}
		 System.out.println(sum);
	}
}
public static void main(String[]args) {
	int[]arr= {3,5,2,1,8,4,9};
	subArraysum(arr,3);
}
}

