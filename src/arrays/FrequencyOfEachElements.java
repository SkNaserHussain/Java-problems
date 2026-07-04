/*
 * Write a program in java to print the frequency of each elements in an array.
 */

package arrays;

public class FrequencyOfEachElements {
public static void frequency(int[] arr) {
	boolean[] printed=new boolean[arr.length];
	for(int i=0;i<arr.length;i++) {
		if(printed[i]) {
			continue;
		}
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				printed[j]=true;
				count++;
			}
		}
	System.out.println("Count of "+arr[i] + " -> " + count);
	}
}
public static void main(String[]args) {
	int[] arr= {10,20,30,40,20,10};
	frequency(arr);
}
}
