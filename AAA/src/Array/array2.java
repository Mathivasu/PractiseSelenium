package Array;

import java.util.HashSet;
import java.util.Scanner;
public class array2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array");
	int size = sc.nextInt();
	int ar[] = new int[size];
	for(int i = 0; i<size ;i++) {
		ar[i] = sc.nextInt();
	}
	HashSet <Integer> uniqueele = new HashSet<>();
	for(int num : ar) {
		uniqueele.add(num);
		}
		/*int unique[] = new int[uniqueele .size()];
		int index = 0;
		for(int num : uniqueele) {
			unique[index++]= num;
		 }*/
		for (int nums: uniqueele) {
            System.out.print(nums+ " ");
	}	

	}
}

