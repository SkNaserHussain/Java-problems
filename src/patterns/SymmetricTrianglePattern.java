/*
 * Write a Java program to print a star (*) pattern in which the number of stars increases from 1 to n and then decreases back to 1.
 */

package patterns;

public class SymmetricTrianglePattern {
public static void symmetricTriangle(int n) {
	for(int i=1;i<=2*n-1;i++) {
		int num;
		if(i<=n) {
			num=i;
		}
		else {
			num=2*n-i;
		}
		for(int j=1;j<=num;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	symmetricTriangle(4);
}
}
