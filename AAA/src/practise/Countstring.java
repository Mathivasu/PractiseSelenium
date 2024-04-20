package practise;

import java.util.Scanner;

public class Countstring {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter the String name");
        String name = s.nextLine();
        int count = 0;

        for(int i = 0;i<name.length(); i++){ 
            if(name.charAt(i)!= ' '){
                count++;
            }}
                System.out.print(count);

	

}
}