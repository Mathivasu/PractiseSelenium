package practise;

import java.util.LinkedHashSet;

public class Strin1_removeduplicate {

	public static void main(String[] args) {
		String st1 = "wresource";
		LinkedHashSet <Character>remove = new LinkedHashSet<>();
		for(char c : st1.toCharArray()) {
			remove.add(c);
		}
		 StringBuilder result = new StringBuilder();
	        for (Character c : remove) {
	            result.append(c);
	        }
	System.out.print(result);
	}
}

