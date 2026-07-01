//Write a java program to find the count of pairs whose sum is greater than k...Given array is{5,7,2,3,1} and k=6.

package arrays;

public class CountPairsGreaterThanK {
public static int countPairs(int[] arr,int k) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			int sum=arr[i]+arr[j];
			if(sum>k)
				count++;
		}
	}
	return count;
}
public static void main(String[]args) {
	int[] arr= {5,7,2,3,1};
	int res=countPairs(arr,6);
	System.out.println(res);
}
}
