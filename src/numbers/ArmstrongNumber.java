package numbers;

public class ArmstrongNumber {
public static boolean isArmstrong(int num) {
	int sum=0,count=countDigit(num),copy=num;
	while(num!=0) {
		int ld=num%10;
		sum=sum+(int) Math.pow(ld,count);
		num/=10;
	}
	return sum==copy;
}
public static int countDigit(int num) {
	int count=0;
	while(num!=0) {
		count++;
		num/=10;
	}
	return count;
}
public static void main(String[]args) {
	System.out.println(isArmstrong(153));
}
}
