package windows.handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winhan {

	public static void main(String[] args) {
	 
	/*	WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/loginpagePractise/#");
		d.manage().window().maximize();
		d.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window = d.getWindowHandles();
		Iterator<String> window1 =window.iterator();
		String parent =window1.next();
		String child = window1.next();
		d.switchTo().window(child);
		System.out.print(d.findElement(By.cssSelector(".im-para.red")).getText());
		d.findElement(By.cssSelector(".im-para.red"));
		*/
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
        
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

	}

}
