package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
	    WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));		
		create.click();
		
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("poun");
		
		Thread.sleep(2000);
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("kumar");
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.sendKeys("kumar42@gmail.com");
	
		Thread.sleep(2000);
		WebElement reemail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		reemail.sendKeys("kumar42@gmail.com");
		
	    Thread.sleep(2000);
	    WebElement password = driver.findElement(By.id("password_step_input"));
	    password.sendKeys("56627774");
	    
	    Thread.sleep(2000);
	    WebElement day = driver.findElement(By.id("day"));
	    Select s = new Select(day);
	    s.selectByValue("30");
	    
	    Thread.sleep(2000);
	    WebElement month = driver.findElement(By.id("month"));
	    Select s1 = new Select(month);
	    s1.selectByVisibleText("Jun");
	    
	    Thread.sleep(2000);
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2 = new Select(year);
	    s2.selectByValue("1999");
	    
	    Thread.sleep(2000);
	    WebElement male = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	    male.click();
	    
	    Thread.sleep(2000);
	    WebElement singup = driver.findElement(By.name("websubmit"));
	    singup.click();
	    		
	    		

	    
	
		
		
		
	
	
	
	
	
	}

}
