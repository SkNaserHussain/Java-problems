/*
 * Write a program in java to print an upright right angle triangle. 
 */

package patterns;

public class UprightRightAngleTriangle {
public static void triangle(int n) {
	for(int i=1;i<=n;i++) {
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
