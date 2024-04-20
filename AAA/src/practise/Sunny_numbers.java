package practise;

import java.util.Scanner;

public class Sunny_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc  = new Scanner(System.in);
         System.out.print("Enter the number");// 80
         int numbers = sc.nextInt();
         int sqr = (int)Math.sqrt(numbers+1); // 80+1 = 81 =9*9 = 81
         if(sqr*sqr == numbers+1) {
        	 System.out.println("is sunny numbers");
         }
         else {
        	 System.out.println("Not is sunny numbers");
         }
           		 
	}

}
