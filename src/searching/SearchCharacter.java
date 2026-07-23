/*
 * Write a Java program to perform Linear Search
 * to find a character in a given string.
 */

package searching;

public class SearchCharacter {
public static int charIndex(String str,char target) {
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==target) {
			return i;
		}
	}
	return -1;
}
public static void main(String[] args) {
	String str="Naser";
	char target='s';
	int ans=charIndex(str,target);
	System.out.println(ans);
}
}
