package numbers;

public class SumofDigits {
public static int printSum(int num) {
     int sum=0;
     while(num!=0) {
    	 int ld=num%10;
    	 sum=sum+ld;
    	 num/=10;
     }
     return sum;
}
public static void main(String[]args) {
	System.out.println(printSum(4589));
}
}
