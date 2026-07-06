/*
 * Write a program in java to print a centered pyramid of height n
 */

package patterns;

public class AlphabetPyramidPattern {
public static void pyramid(int n) {
	int mid=n;
	for(int row=1;row<=n;row++) {
		char ch='a';
		for(int col=1;col<=2*n-1;col++) {
			if(row+col>=n+1 && col-row<=n-1) 
			  if(col<mid)
				System.out.print(ch++ +" ");
			  else
				  System.out.print(ch-- +" ");
			else 
				System.out.print("  ");			
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	pyramid(6);
}
}
