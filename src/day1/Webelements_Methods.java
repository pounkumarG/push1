package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Methods {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("poun61@gmail.com");
		
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("pounkumar");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
	}

}
