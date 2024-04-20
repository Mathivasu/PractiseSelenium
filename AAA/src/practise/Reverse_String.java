package practise;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
       /*
		// Reverse word in the  string
		 // example: i/p:Vasu , o/p usav
		Scanner s = new Scanner(System.in);
		System.out.print("enter the String");
		String str = s.nextLine();
		for(int i = str.length(); i > 0;i--) {
			char str1 = str.charAt(i-1);
			System.out.print(str1);
		}
		
 */
		//Reverse each word in the string:
		// example : welcome to java 
		//         : emoclew ot avaj
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the given String;");
		String st = sc.nextLine();
		String words[] = st.split(" ");
		String Reverseword = " ";
		 for (String w: words) {
			 
			 String reversefinal = " ";
			 
			 for(int i = w.length();i > 0; i--) {
				 reversefinal = reversefinal+w.charAt(i-1);
				
			 }
			 Reverseword =  Reverseword+reversefinal;
		 }
			 System.out.print( Reverseword);
			 
		 }
		
		

	}

