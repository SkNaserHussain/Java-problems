package numbers;

public class StrongNumber {
public static boolean isStrong(int num) {
	int sum=0, copy=num;
	while(num!=0) {
		int ld=num%10, fact=1;
		for(int i=1;i<=ld;i++) {
			fact*=i;
		}
		sum=sum+fact;
		num/=10;
	}
	return sum==copy;
}
public static void main(String[]args) {
	System.out.println(isStrong(145));
}
}
