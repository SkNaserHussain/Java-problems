package numbers;

public class TechNumber {
public static boolean isTechnumber(int num) {
	int count=countDigit(num);
	if(count%2!=0) {
		return false;
	}
	int exp=count/2;
	int A=num%(int) Math.pow(10, exp);
	int B=num/(int) Math.pow(10, exp);
	return (A+B)*(A+B)==num;
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
	System.out.println(isTechnumber(2025));
}
}
