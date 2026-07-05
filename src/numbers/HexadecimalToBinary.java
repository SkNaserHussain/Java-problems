/*
 * Write a program in java to convert a decimal number to hexadecimal
 */

package numbers;

public class HexadecimalToBinary {
public static void binaryConversion(int num) {
	String str="";
	String hexDigits="0123456789ABCDEF";
	while(num!=0) {
		int ld=num%16;
		str=hexDigits.charAt(ld)+str;
		num/=16;
	}
	System.out.println(str);
}
public static void main(String[] args) {
	binaryConversion(15);
}
}
