package interviewquestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdowncalendar {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/datepicker/#Simple%20Date%20Picker");
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ab = driver.findElement(By.xpath("//*[@id='DropDown DatePicker']"));
		//	ab.click();
		JavascriptExecutor execute = (JavascriptExecutor)driver;
execute.executeScript("arguments[0].click()", ab);
driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[2]/p/iframe")));
Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).click();
		String date= "28/Feb/1993";
		String daarray[]	=date.split("/");
		String day = daarray[0];
		String Month = daarray[1];
		String year = daarray[2];
		Select select = new Select(driver.findElement(By.className("ui-datepicker-month")));
		select.selectByVisibleText("Feb");
		Select select1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
select1.selectByValue("2010");	
driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[1]/a")).click();

		//driver.close();
		//driver.switchTo().frame("glSqa");
		//driver.findElement(By.xpath("//input[@id='custom_field_text_field_1016375']")).sendKeys("basha0752@gmail.com");

}
}