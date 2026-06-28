package numbers;

public class DisariumNumber {
public static boolean isDisarium(int num) {
	int sum=0,copy=num,count=countDigit(num);
	while(num!=0) {
		int ld=num%10;
		sum=sum+(int) Math.pow(ld,count--);
		num/=10;
	}
	return sum==copy;
}
public static int countDigit(int n) {
	int count=0;
	while(n!=0) {
		count++;
		n/=10;
	}
	return count;
}
public static void main(String[]args) {
	System.out.println(isDisarium(125));
}
}
