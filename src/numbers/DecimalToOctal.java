/*
 * Write a program in java to convert decimal number to octal...
 */

package numbers;

public class DecimalToOctal {
public static void conversion(int num){
	String str="";
	while(num!=0) {
		int ld=num%8;
		str=ld+str;
		num/=8;
	}
	System.out.println(str);
}
public static void main(String[] args) {
	conversion(10);
}
}
