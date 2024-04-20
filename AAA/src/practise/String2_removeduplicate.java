package practise;

import java.util.LinkedHashSet;

public class String2_removeduplicate {

	public static void main(String[] args) {
		String input = "abcd";
		String removefrominput = "ab";
		LinkedHashSet <Character>remove = new LinkedHashSet<>();
		for(char c : removefrominput.toCharArray()) {
			remove.add(c);
			
		}
		 StringBuilder result = new StringBuilder();
	        for (Character c : input.toCharArray()) {  
	        	 if (!remove.contains(c)) {
	            result.append(c);
	        }}
	System.out.print(result.toString());

	
	}
}
