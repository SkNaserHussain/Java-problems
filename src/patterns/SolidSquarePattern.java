/*
 * Write a Java program to print a square pattern of * having n rows and n columns.
 */

package patterns;

public class SolidSquarePattern {
public static void squarePattern(int n) {	 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
}
public static void main(String[] args) {
	squarePattern(4);
}
}
