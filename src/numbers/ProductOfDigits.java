package numbers;

public class ProductOfDigits {
public static int printProd(int num){
	int prod=1;
	while(num!=0) {
	int ld=num%10;
	prod=prod*ld;
	num/=10;
     }
    return prod;
}
public static void main(String[]args) {
	System.out.println(printProd(456));
}
}