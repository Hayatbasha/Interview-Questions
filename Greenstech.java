package interviewquestions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Greenstech {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("---headless");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.co.in");
		 
/* using JSExecutor
 ((JavascriptExecutor)driver).executeScript("window.open()");
ArrayList<String> tabs = new ArrayList<String>( driver.getWindowHandles() );
driver.switchTo().window(tabs.get(1)); */

/*using Robot class
		 String currentHandle= driver.getWindowHandle();
Robot rob = new Robot();
rob.keyPress(KeyEvent.VK_CONTROL);
rob.keyPress(KeyEvent.VK_T);
rob.keyRelease(KeyEvent.VK_CONTROL);
rob.keyRelease(KeyEvent.VK_T);
Set < String > handles = driver.getWindowHandles();
for (String actual: handles) {
    if (!actual.equalsIgnoreCase(currentHandle)) { //switching to the opened tab              
        driver.switchTo().window(actual); //opening the URL saved.              
        driver.get("http://www.greenstechnologies.in/selenium-training.php");
    }
*/
		 
		
		 

driver.get("http://www.greenstechnologies.in/selenium-training.php");
//System.out.println(driver.findElement(By.cssSelector("div.small_desc")).getText());
List <WebElement> ele = driver.findElements(By.xpath("//div[@class='small_desc']/*[not(self::p)]"));
for (WebElement webent : ele) {
	System.out.println(webent.getText());
}	

		System.out.println();
		/*
		 * List<WebElement> li =
		 * driver.findElements(By.xpath("//*[@id=\"course-home\"]/div/ul/li")); for
		 * (WebElement webment : li) { System.out.println(webment.getText()); }
		 */
		
		

	}
	
}
