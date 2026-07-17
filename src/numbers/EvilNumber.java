package numbers;

public class EvilNumber {
public static void evil(int num) {
	int count=0;
	String bin="";
	while(num!=0) {
		int ld=num%2;
		if(ld==1)
			count++;
		bin+=ld;
		num/=2;
	}
	System.out.println("Binary representation="+bin);
	System.out.println("Number of 1's="+count);
	if(count%2==0) {
		System.out.println("Evil Number!!");
	}else {
		System.out.println("Odious Number!!");
	}
}
public static void main(String[] args) {
	evil(27);
}
}
