/*
 * Write a program in java to print a solid rectangle with character "*".
 */

package patterns;

public class SolidRectanglePattern {
public static void rectangle(int n) {
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=2*n-1;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	rectangle(4);
}
}
