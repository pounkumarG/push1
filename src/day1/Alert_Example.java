package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement normal = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		normal.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		WebElement confirmAlert = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		confirmAlert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		WebElement Prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		Prompt.click();
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("greens technology");
		driver.switchTo().alert().accept();
	
	}

}
