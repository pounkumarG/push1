package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {
	
	private static int indexofnew;
	private static int indexoftest;
	private static int indexoftotal;
	private static int indexofcases;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium 11Am\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		List<WebElement> all_headers = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 1; i < all_headers.size(); i++) {
			String text = all_headers.get(i).getText();
			String head = text.replaceAll("\n", " ");
			System.out.println(head);	
			
			if (head.equalsIgnoreCase("total cases")) {
				 indexofcases =i;
				 System.out.println("Index Of total cases:"+indexofcases);
				 }
			
			if (head.equalsIgnoreCase("total deaths")) {
				 indexoftotal =i;
				 System.out.println("Index Of total deaths:"+indexoftotal);
				 }
			if (head.equalsIgnoreCase("total tests")) {
				  indexoftest = i;
				 System.out.println(" Index Of total tasts:"+indexoftest);
				 }
		       }
		
		List<WebElement> all_row = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
		for (int i = 1; i < all_row.size(); i++) {
			List<WebElement> all_data = all_row.get(i).findElements(By.tagName("td"));
			for (int j = 1; j < all_data.size(); j++) {
				if (all_data.get(j).getText().equalsIgnoreCase("Uk")) {
					System.out.println("total total cases: "+all_data.get(indexofcases).getText());
					System.out.println("total total deaths:"+all_data.get(indexoftotal).getText());
					System.out.println("total total tests:"+all_data.get(indexoftest).getText());
					
				}
				
			}
			
			
			
			
			
			
			
		}
		
		
		
	}

}
