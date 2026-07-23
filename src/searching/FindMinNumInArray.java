/*
 * Write a Java program to find the minimum element in an array using Linear Search.
 */

package searching;

public class FindMinNumInArray {
public static int findMin(int[] arr) {
	if(arr.length==0)
		return -1;
	int ans= arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<ans) {
			ans=arr[i];
		}
	}
	return ans;
}
public static void main(String[] args) {
	int[] arr= {16,8,3,-7,13,19};
	int sol=findMin(arr);
	System.out.println(sol);
}
}
