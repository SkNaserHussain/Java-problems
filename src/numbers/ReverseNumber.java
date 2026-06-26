package numbers;

public class ReverseNumber {
public static void printDigits(int num) {
	while(num!=0) {
		int ld=num%10;
		System.out.println(ld);
		num/=10;
	}
}
public static void main(String[]args) {
	printDigits(8520);
}
}
