package arrays;

public class MaxNumberOf1 {
public static void NoOf1(int[] arr) {
	int count=0;
	int max=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==1) {
			count++;
		if(count>max)
			max=count;
		}
		else {
			count=0;
		}
	}
	System.out.println("The number of consecutive 1 is = "+max);
}
public static void main(String[] args) {
	int arr[]= {0,1,1,1,0,1,1,1,1,0,1,0,1,1,0,1,0,1};
	NoOf1(arr);
}
}
