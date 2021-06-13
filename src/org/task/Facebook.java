package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		
	
System.setProperty("webdriver.chrome.driver","D:\\Automation\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("prathap");
	driver.findElement(By.id("pass")).sendKeys("12345");
	driver.findElement(By.name("login")).click();
}
}