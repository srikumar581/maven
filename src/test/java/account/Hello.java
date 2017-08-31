package account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Hello {
	
	WebDriver d;
	@Test
	public void run()
	{
		System.setProperty("webdriver.gecko.driver","E://geckodriver.exe");
		d=new FirefoxDriver();
		d.get("https://accounts.google.com/SignUp?hl=en");
		System.out.println("The Title of the Web Page:"+d.getTitle());
		d.findElement(By.id("FirstName")).sendKeys("Sakhi");
		d.close();
	}
	

}
