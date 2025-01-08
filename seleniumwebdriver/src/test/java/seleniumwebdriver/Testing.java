package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver webDriver = new ChromeDriver();
		
		webDriver.get("https://www.facebook.com");
		WebElement email_field = webDriver.findElement(By.id("email"));
          email_field.sendKeys("kaaruna");
          
          WebElement passwordField = webDriver.findElement(By.id("pass"));
          passwordField.sendKeys("kaaruna");
          
          WebElement loginbtn = webDriver.findElement(By.name("login"));
          loginbtn.click();
          
         
	}

}
