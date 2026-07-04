/*
 * Find the frequency of the characters of the string "hello"
 */

package arrays;

public class FindFrequencyOfCharacter {
public static void frequencyChar(String str) {
	int[] arr=new int[26];
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		arr[ch-'a']++;
	}
	for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            System.out.println((char)(i + 'a') + " -> " + arr[i]);
        }
	}
}
public static void main(String[]args) {
	String str="hello";
	frequencyChar(str);
}
}
