package numbers;

public class ReverseNumber {
public static int printNumber(int num) {
	int rev=0;
	while(num!=0) {
		int ld=num%10;
		rev=rev*10+ld;
		num/=10;
	}
	return rev;
}
public static void main(String[]args) {
	System.out.println(printNumber(986));
}
}
