package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebelementUnderlinedorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.co.in");
		WebElement tamil = driver.findElement(By.xpath("//*[@id=\'SIvCob\']/a[5]"));
		String  before = tamil.getCssValue("text-decoration");
		System.out.println("before is:"+before);
		Actions action = new Actions(driver);
		action.moveToElement(tamil).perform();
	//	action.perform();
		String  after = tamil.getCssValue("text-decoration");
		System.out.println("after is:"+after);

		
	}

}
