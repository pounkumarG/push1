package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multiple);
		
		s.selectByValue("1");
		s.selectByVisibleText("Appium");
		s.selectByIndex(3);
		s.selectByValue("4");
		
		s.deselectByIndex(3);
		s.deselectByValue("4");
		
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		
		System.out.println("==ALL OPTIONS==");
		List<WebElement> options = s.getOptions();
		for (WebElement all : options) {
			String text = all.getText();
			System.out.println(text);
		}	
			
		System.out.println("==selected options");	
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement selected : allSelectedOptions) {
				String text2 = selected.getText();
				System.out.println(text2);
			}
			
			System.out.println("==first selected==");
			WebElement first = s.getFirstSelectedOption();
			String text = first.getText();
			System.out.println(text);
			
		
			
			
			
		
		
	}

}
