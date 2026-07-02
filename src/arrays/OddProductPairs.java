/*Write a Java program to find all pairs in an array whose product is odd. Return an array containing two values:

1)The count of such pairs.
2)The maximum odd product among those pairs.
*/
package arrays;
import java.util.Arrays;

public class OddProductPairs {
public static int[] countPairs(int[] arr) {
	int count=0;
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length-1;i++) {	
		for(int j=i+1;j<arr.length;j++) {
			int prod=arr[i]*arr[j];
			if(prod%2!=0) {
				count++;
			max=Math.max(prod, max);
			}
		}
	}
	if(count==0) {
		return new int[] {0,-1};
	}
	return new int[] {count,max};
}
public static void main(String[]args) {
	int[] arr= {5,7,2,3,1};
	int[] res=countPairs(arr);
    System.out.println(Arrays.toString(res));
}
}
