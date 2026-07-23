package searching;

public class LinearSearch {
public static int linearSearch(int[] arr, int target) {
	if(arr.length==0) {
		return -1;
	}
	for(int i=0;i<arr.length;i++) {
		int item=arr[i];
		if(item==target) {
		return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
int[] arr= {16,25,8,12,35,59,64,42,38};
int target=65;
int ans=linearSearch(arr,target);
System.out.println(ans);
}
}
