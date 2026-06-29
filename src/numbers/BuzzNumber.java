package numbers;

public class BuzzNumber {
public static boolean isBuzz(int num) {
	int posnum=Math.abs(num);
	return posnum%7==0||posnum%10==7;
}
public static void main(String[]args) {
	System.out.println(isBuzz(-47));
}
}
