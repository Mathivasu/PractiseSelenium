package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Findlargestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i =0 ; i<size; i++)
		arr[i] = sc.nextInt();
		/*int largest = arr[0];
		for(int i = 1; i<arr.length; i++){
		if(arr[i] > largest) {
		largest = arr[i];
		}
		}	
		System.out.print(largest);
		*/
		Arrays.sort(arr);
		int secondlargest = arr[arr.length-2];
		System.out.println(secondlargest);
	}
	}


