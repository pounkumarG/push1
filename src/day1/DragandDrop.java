package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/drop.html");
	    driver.manage().window().maximize();
	    
	    
	    Thread.sleep(2000);
	    WebElement source = driver.findElement(By.id("draggable"));
	   
	    WebElement target = driver.findElement(By.id("droppable"));
	    
	    Actions dd = new Actions (driver);
	    Thread.sleep(2000);
	    
	    dd.dragAndDrop(source, target).build().perform();
	    
	   

	    
	
	
	    
	
	
	
	
	}

}
