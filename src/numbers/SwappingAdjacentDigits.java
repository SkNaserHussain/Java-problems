/*
 * Write a Java program to swap every pair of adjacent digits in a given integer and return the resulting number.
 */

package numbers;

public class SwappingAdjacentDigits {
public static void swap(int num) {
	int res=0;
	int mul=1;
	while(num!=0) {
		int ld1=num%10;
		num/=10;
		if(num==0) {
			res+=ld1*mul;
			break;
		}
		int ld2=num%10;
		num/=10;
		res+=(ld1*10+ld2)*mul;
		mul*=100;
	}
	System.out.println(res);
}
public static void main(String[] args) {
	swap(12345678);
}
}
