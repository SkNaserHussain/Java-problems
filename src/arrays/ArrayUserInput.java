package arrays;

import java.util.Scanner;
public class ArrayUserInput {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of an array: ");
	int size=s.nextInt();
	int[] arr=new int[size];
	System.out.println("Enter Array Elements: ");
	for(int i=0;i<arr.length;i++) {
		arr[i]=s.nextInt();
		}
	System.out.println("The array elements are: ");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	s.close();
	}
}
