/*
 * Write a program in java to convert decimal to binary
 */

package numbers;

public class DecimalToBinary {
public static void binaryConversion(int num) {
	String str="";
	while(num!=0) {
		int ld=num%2;
		str=ld+str;
		num/=2;
	}
	System.out.println(str);
}
public static void main(String[] args) {
	binaryConversion(6);
}
}
