package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get->driver.get(string,url)->launch website
		//condition -> driver.gettile->title of 
		//browser
		//navigation
		//wait
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement webElement = webDriver.findElement(By.linkText(" OrangeHRM, Inc"));
		webElement.clear();
		
		System.out.println("currwnt url:"+webDriver.getCurrentUrl());

	}

}
