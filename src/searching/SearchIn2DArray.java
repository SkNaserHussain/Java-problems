package searching;

import java.util.Arrays;
public class SearchIn2DArray {
public static int[] search(int[][] arr,int target) {
	if (arr.length == 0)
        return new int[] {-1, -1};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==target) {
				return new int[] {i,j};
			}
		}
	}
	return new int[] {-1,-1};
}
public static void main(String[] args) {
	int[][] arr= {
			{10,23,25},
			{14,19,47},
			{45,58,29}
	};
	int target=19;
	int[] ans=search(arr,target);
	System.out.println(Arrays.toString(ans));
}
}
