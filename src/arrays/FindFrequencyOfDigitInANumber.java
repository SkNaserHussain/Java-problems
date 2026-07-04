/*
 * Write a program in java to find the frequency of a digit in a number.
 */


package arrays;

public class FindFrequencyOfDigitInANumber {
public static void digitFrequency(long num) {
	int[] arr=new int[10];
	while(num!=0) {
		int ld=(int)(num%10);
		arr[ld]++;
		num/=10;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println("Countof "+i+"is: "+arr[i]);
	}
}
public static void main(String[]args) {
	long num=12137850120135L;
	digitFrequency(num);
}
}
