/*
 * Write a Java program to print a plus (+) shaped pattern where the center is represented by # and the remaining arms are represented by *.
 */

package patterns;

public class PlusPattern {
public static void pattern(int n) {
	int mid=n/2+1;
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=n;col++) {
			if(row==mid && col==mid) {
				System.out.print("#");
			}else if(row==mid || col==mid) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	pattern(7);
}
}
