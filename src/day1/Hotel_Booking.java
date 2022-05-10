package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel_Booking {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/index.php");
		
		
	
     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	    
	    WebElement usname = driver.findElement(By.name("username"));
	    usname.sendKeys("pounkumarg2");
	    
	    WebElement password1 = driver.findElement(By.id("password"));
	    password1.sendKeys("7654321");
	    
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	    
	    WebElement location = driver.findElement(By.id("location"));
	    Select s = new Select(location);
	    s.selectByValue("New York");
	    
	    WebElement hotels = driver.findElement(By.id("hotels"));
	    Select s1 = new Select(hotels);
	    s1.selectByVisibleText("Hotel Creek");
	    WebElement text = s1.getFirstSelectedOption();
	    String text2 = text.getText();
	    System.out.println(text2);
	    
	    WebElement roomtype = driver.findElement(By.id("room_type"));
	    Select s2 = new Select(roomtype);
	    s2.selectByValue("Double");
		
	    WebElement noroom = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(noroom);
		s3.selectByIndex(3);
	    
	    
	    WebElement datein = driver.findElement(By.id("datepick_in"));
	    datein.sendKeys("");
	    
	    WebElement dateout = driver.findElement(By.id("datepick_out"));
	    dateout.sendKeys("");
	    
	    WebElement adult  = driver.findElement(By.id("adult_room"));
	    Select s4 = new Select(adult);
	    s4.selectByValue("2");
	    
	    WebElement children = driver.findElement(By.id("child_room"));
	    Select s5 = new Select(children);
	    s5.selectByIndex(1);
	    
	    WebElement search = driver.findElement(By.id("Submit"));
	    search.click();
	    
	    WebElement button = driver.findElement(By.id("radiobutton_0"));
	    button.click();
		
	    WebElement cont = driver.findElement(By.id("continue"));
	    cont.click();
	    
	    WebElement fname = driver.findElement(By.id("first_name"));
	    fname.sendKeys("poun");
	    
	    WebElement lname = driver.findElement(By.id("last_name"));
	    lname.sendKeys("kumar");
	    
	    WebElement address = driver.findElement(By.id("address"));
	    address.sendKeys("wwww,yyyy,zzzzz");
	    
	    WebElement ccard = driver.findElement(By.id("cc_num"));
	    ccard.sendKeys("1234567890123456");
	    
	    WebElement cctype = driver.findElement(By.id("cc_type"));
	    Select s6 = new Select(cctype);
	    s6.selectByIndex(2);
	    
	    WebElement month = driver.findElement(By.id("cc_exp_month"));
	    Select s7 = new Select(month);
	    s7.selectByVisibleText("March");
	    
	    WebElement year = driver.findElement(By.id("cc_exp_year"));
	    Select s8 = new Select(year);
	    s8.selectByValue("2015");
	    
	    WebElement ccnumber = driver.findElement(By.id("cc_cvv"));
	    ccnumber.sendKeys("12345");
	    
	    WebElement booknow = driver.findElement(By.id("book_now"));
	    booknow.click();
	    
	    WebElement ltname = driver.findElement(By.id("last_name"));
	    ltname.sendKeys("g");
	    
	    WebElement lout = driver.findElement(By.id("logout"));
	    lout.click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
