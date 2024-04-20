package practise;

import java.util.Scanner;

public class Count_Vowel_Constant {

	public static void main(String[] args) {
		int vcount =0,ccount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String str1 = str.toLowerCase();
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
				vcount++;
			}}
			System.out.print(vcount);
		
	
		
			
		
		
		
		
		
		
		
		
        
	}

}
