/*
 * Write a Java program to print a solid centered pyramid star (*) pattern of height n.
 */

package patterns;

public class SolidCenteredPyramid {
public static void pyramid(int n) {
	for(int row=1;row<=n;row++) {
		for(int col=1;col<=2*n-1;col++) {
			if(row+col>=n+1 && col-row<=n-1) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	pyramid(6);
}
}
