package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	int 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/sanchita/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Kids");
	driver.findElement(By.xpath("//div[@id=\'nav-search\']/form/div[2]/div/input")).click();

	int size=driver.findElements(By.xpath("//div[@class='s-result-list s-search-results sg-row']/div")).size();
	System.out.println(size);
	//for (int i=0;i<size)
	}

}
