package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exectionscript{
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
        driver.manage().window().maximize();
        
       Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement maxheight = driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[9]"));
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", maxheight);
        
	}

}
