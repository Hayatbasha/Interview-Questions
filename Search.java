package interviewquestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Search {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start--maximized");
		driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
	driver.findElement(By.name("q")).sendKeys("Dexter"+Keys.ENTER);
	List<WebElement> not = driver.findElements(By.xpath("//*[@id='search']//div//div//a//div//cite"));
	for(WebElement we: not) {
		System.out.println(we.getText());
	}
	/*Thread.sleep(3000);
	List<WebElement> li = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	for (WebElement weblement : li) {
		System.out.println(weblement.getText());
	}*/

	}

}
