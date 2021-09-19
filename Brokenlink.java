package interviewquestions;

import java.io.IOException;
/*import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
*/
/*public class Brokenlink {

	//private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String homePage = "http://www.google.co.in/";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homePage);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			url = it.next().getAttribute("href");
			System.out.println(url);
			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			if (!url.startsWith(homePage)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}
			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			}
		}
		driver.quit();
	}
}*/
	  import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import
	  java.util.List;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
	  org.openqa.selenium.WebElement; import
	  org.openqa.selenium.chrome.ChromeDriver; import
	  org.openqa.selenium.firefox.FirefoxDriver;
	  
	  public class Brokenlink {
	  
	  
	  public static void main(String[] args) throws MalformedURLException, IOException { 

		  System.setProperty("webdriver.chrome.driver",  "G:\\chromedriver_win32\\chromedriver.exe"); 
	  WebDriver driver = new  ChromeDriver();  
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  List<WebElement> links=driver.findElements(By.tagName("a"));
	  links.addAll(driver.findElements(By.tagName("img")));
	 List<WebElement> Active = new ArrayList<WebElement>();
	 System.out.println("No of active :" +links.size());
	 for (int i = 0; i < links.size(); i++) {
		 System.out.println(links.get(i).getAttribute("href"));
		if(links.get(i).getAttribute("href")!=null && (! links.get(i).getAttribute("href").contains("javascript"))) {
			Active.add(links.get(i));
		}
	}//
		System.out.println("new active---->"+Active.size());
		
		TrustManager[] trustAllCerts = new TrustManager[]{
		        new X509TrustManager() {

		            public java.security.cert.X509Certificate[] getAcceptedIssuers()
		            {
		                return null;
		            }
		            public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType)
		            {
		                //No need to implement.
		            }
		            public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType)
		            {
		                //No need to implement.
		            }
		        }
		};

		// Install the all-trusting trust manager
		try 
		{
		    SSLContext sc = SSLContext.getInstance("SSL");
		    sc.init(null, trustAllCerts, new java.security.SecureRandom());
		    HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		} 
		catch (Exception e) 
		{
		    System.out.println(e);
		}

	for (int j = 0; j < Active.size(); j++) {
		
		HttpURLConnection connection = (HttpURLConnection)new URL(Active.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(Active.get(j).getAttribute("href")+response);
} 
	}}
		/*
		 * System.out.println("Total links are "+links.size()); for (WebElement
		 * webElement : links) { String url = webElement.getAttribute("href");
		 * verifyLinkActive(url); }
		 */
	  
		/*
		 * for(int i=0;i<a;i++) {
		 * 
		 * WebElement ele= links.get(i);
		 * 
		 * String url=ele.getAttribute("href");
		 * 
		 * verifyLinkActive(url);
		 * 
		 * }
		 */
	  
	  
	 /* }
	  
	  public static void verifyLinkActive(String linkUrl)
	  { 
		  try
	  {
		  URL url = new  URL(linkUrl);
	  
	  HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	  
	  httpURLConnect.setConnectTimeout(3000);
	  
	  httpURLConnect.connect();
	  
	  if(httpURLConnect.getResponseCode()==200) {
	  System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage()); }
	  if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
	  System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+
	  HttpURLConnection.HTTP_NOT_FOUND); } } catch (Exception e) {
	  
	  }
	  }}*/