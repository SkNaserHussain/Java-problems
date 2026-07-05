/*
 * Write a Java program to print an inverted centered alphabet pyramid pattern of height n.
 */

package patterns;

public class InvertedAlphabetPyramid {
public static void pyramid(int n) {
	for(int row=n;row>=1;row--) {
		char ch='a';
		for(int space=1;space<=n-row;space++) {
			System.out.print(" ");
		}
		for(int col=1;col<=(2*row-1);col++) {
			System.out.print(ch++);
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	pyramid(4);
}
}
