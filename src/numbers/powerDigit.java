package numbers;

public class powerDigit {
public static int power(int base,int exp) {
	int power=1;
	while(exp>0) {
		power=power*base;
		exp--;
	}
	return power;
}
public static void main(String[]args) {
	System.out.println(power(4,5));
}
}
