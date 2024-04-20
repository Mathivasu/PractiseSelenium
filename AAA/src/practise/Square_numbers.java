package practise;

import java.util.Scanner;

public class Square_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		double numbers = sc.nextDouble();
		if(checksqnumbers(numbers)) {
			System.out.print(numbers+"Given number is perfect square numbers");
		}
		else {
			System.out.print(numbers+"Given number is perfect not square numbers");
		}}
		public static boolean checksqnumbers(double numbers){
			double num = Math.sqrt(numbers);
			return  num == (int)num;
		}
        
	
}
