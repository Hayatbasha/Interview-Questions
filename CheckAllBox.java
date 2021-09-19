package interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAllBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/checkbox.html");
		
		  driver.findElement(By.xpath("//div[contains(text(),'Option 1')]//input")).click();
		  driver.findElement(By.xpath("//div[contains(text(),'Option 2')]//input")).click();
		  driver.findElement(By.xpath("//div[contains(text(),'Option 3')]//input")).click();
		  driver.findElement(By.xpath("//div[contains(text(),'Option 4')]//input")).click();
		  driver.findElement(By.xpath("//div[contains(text(),'Option 5')]//input")).click();
		 
		/*
		 * List<WebElement> element =
		 * driver.findElements(By.xpath("//input[@type='checkbox']")); for (WebElement
		 * webElement : element) { webElement.click(); }
		 */
		driver.findElement(By.xpath("//div[contains(text(),'Selenium')]//input")).click();
		
		
	}

}
