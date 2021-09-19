package interviewquestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousemovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.switchTo().frame("//*[@id=\'destination_publishing_iframe_spicejet_0\']");
		Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id=\'highlight-addons\']"))).build().perform();
		driver.findElement(By.linkText("SpiceAssurance")).click();*/
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement from = 	driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement to = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement f1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement t1 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	WebElement f2 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement t2 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement f3 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement t3 = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
		action.dragAndDrop(f1, t1).build().perform();
		action.dragAndDrop(f2, t2).build().perform();
		action.dragAndDrop(f3, t3).build().perform();
	}

}
