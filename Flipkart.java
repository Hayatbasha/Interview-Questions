package interviewquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
ChromeOptions option = new ChromeOptions();
option.addArguments("----start-maximized");
WebDriver driver = new ChromeDriver(option);
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("https://www.flipkart.com");
driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
List<WebElement> lis = driver.findElements(By.tagName("a"));
lis.addAll(driver.findElements(By.tagName("img")));
System.out.println(lis.size());

List<WebElement> Active = new ArrayList<WebElement>();

for (int i = 0; i < lis.size(); i++) {
	 System.out.println(lis.get(i).getAttribute("href"));
	if(lis.get(i).getAttribute("href")!=null && (! lis.get(i).getAttribute("href").contains("javascript"))) {
		Active.add(lis.get(i));
	}
}//
	System.out.println("new active---->"+Active.size());

	}
	
}
