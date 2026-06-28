package numbers;

public class NthPrimeNumber {
public static int primeNum(int n) {
	int i=2, count=0;
	while(true) {
		if(isPrime(i)) {
			count++;
		  if(count==n) {
			  return i;
		  }
		}
			i++;
		}
	}
public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
public static void main(String[]args) {
	System.out.println(primeNum(5));
}
}
