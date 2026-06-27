package numbers;

public class XylemNumber {
public static boolean isXylem(int num) {
	int extremesum=0;
	int midsum=0;
	
	extremesum=num%10;
	num/=10;
	while(num>=10) {
		int ld=num%10;
		midsum+=ld;
		num/=10;
	}
	extremesum+=num;
	return extremesum==midsum;
}
public static void main(String[]args) {
	System.out.println(isXylem(1234));
}
}
