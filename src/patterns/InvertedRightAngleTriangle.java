/*
 * Write a java program to print an inverted right angle triangle.
 */

package patterns;

public class InvertedRightAngleTriangle {
public static void triangle(int n) {
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	triangle(5);
}
}
