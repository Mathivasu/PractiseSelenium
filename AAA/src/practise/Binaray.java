package practise;

public class Binaray {
public static void main(String[] args) {
		int a []  = {1,2,3,4,5,6,7};
		int key = 12;
		boolean flag = false;
		int l = 0;
		int h = a.length-1;
		while (l<=h) {
			int m = (l+h)/2;
			if(a[m]== key) {
				System.out.println("Element was found");
				flag = true;
				break;
			}
			if(a[m]<key) {
				l = m+1;
			}
			if(a[m] >key) {
				h = m-1;
			}
			
		} 
		    
		if(flag == false) {
			System.out.print( "element not found");
		}
	}
}
