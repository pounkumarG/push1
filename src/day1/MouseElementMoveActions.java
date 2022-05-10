package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseElementMoveActions {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
	    driver.get("http://www.greenstechnologys.com/");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    WebElement course =  driver.findElement(By.xpath("//a[text()='COURSES']"));
	    
	    Actions cc = new  Actions(driver);
	    cc.moveToElement(course).build().perform();
	    
	    Thread.sleep(2000);
	    WebElement datascience = driver.findElement(By.xpath("//span[text()='Data Science Training']"));
	    cc.moveToElement(datascience).build().perform();
	    
	    Thread.sleep(2000);
	    WebElement pythontraining = driver.findElement(By.xpath("//span[text()='Data Science with Python Training']"));
	    pythontraining.click();
	    
	
	
	
	
	
	
	
	
	
	
	}

}
