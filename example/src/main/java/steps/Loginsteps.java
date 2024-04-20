package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Loginsteps {
 WebDriver d;
 @Given("User should navigate to the application")
	public void usershouldnavigate() {
	d = new ChromeDriver();
	d.get("https://bookcart.azurewebsites.net");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @And ("User click on the login link")
   public void userclicklogin() {
	   d.findElement(By.xpath("(//span[normalize-space()='Login'])[1]")).click();
   }
   @ And ("User enter the username as ortoni")
    public void mailid() {
	   d.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("ortoni");
 	     }
   @And ("User enter the password as Pass1234")
    public void password() {
 	   d.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("pass1234");
    }
   @And("User click the login button")
    public void login() {
	   d.findElement(By.xpath("//*[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")).click();
    }
   @Then ("login should be success")
    public void loginsuccess() {
   
    }
    
}
