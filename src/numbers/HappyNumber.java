package numbers;

public class HappyNumber {
public static int sumOfSq(int num) {
	int sum=0;
	while(num!=0) {
		int ld=num%10;
		sum+=ld*ld;
		num/=10;
	}
 return sum;
}

public static boolean isHappy(int num) {
	while(num>9) {
		num=sumOfSq(num);
	}
    return num==1||num==7;	
}

public static void main(String[]args) {
	System.out.println(isHappy(19));
}
}
