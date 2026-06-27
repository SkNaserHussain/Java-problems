package numbers;

public class FirsthalfandSecondhalf {
	public static void divideNumber(int num) {
        int count = countDigit(num);
        int exp = count / 2;
        int firstHalf = num / (int) Math.pow(10, exp);
        int secondHalf = num % (int) Math.pow(10, exp);
        System.out.println("First Half = " + firstHalf);
        System.out.println("Second Half = " + secondHalf);
    }
    public static int countDigit(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        divideNumber(5684);
    }
}
