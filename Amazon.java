package interviewquestions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"G:\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

    WebElement Action = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/div/span"));
    Actions acc=new Actions(driver);
    acc.moveToElement(Action).build().perform();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sbarani46@gmail.com");
    driver.findElement(By.xpath("//input[@id='continue']")).click();	
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Barani@20");
    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("handkerchief for men cotton");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[3]/h2/a/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
    
   //html/body/div[2]/div[2]/div[4]/div[1]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[30]
	}


	}


