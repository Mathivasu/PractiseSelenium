package Array;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array");
		int size = sc.nextInt();
		int ar[] = new int[size];
		for(int i = 0; i<size ;i++) {
			ar[i] = sc.nextInt();
		}
		printevennumbers(ar);
		printoddnumbers(ar);
	}
	public static void  printevennumbers(int ar[]) {
		for(int numbers: ar) {
			if(numbers % 2 == 0) {
				System.out.println(numbers +"The number was even");
			}
		}
	}
	public static void  printoddnumbers(int ar[]) {
		for(int numbers: ar) {
			if(numbers % 2 != 0) {
				System.out.println(numbers +"The number was odd");
			}
	}}
}



