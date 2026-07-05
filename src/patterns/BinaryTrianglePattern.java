/*
 * Write a Java program to print a binary triangle pattern of n rows, where 1 and 0 are printed alternately based on the sum of the row and column indices.
 */

package patterns;

public class BinaryTrianglePattern {
public static void triangle(int n) {
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=row;col++) {
			if((row+col)%2==0) {
				System.out.print("1");
			}else {
				System.out.print("0");
			}
		}
	System.out.println();	
	}
}
public static void main(String[] args) {
	triangle(5);
}
}
