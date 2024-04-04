package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GridTest {
  @Test
  public void testOnChrome() throws MalformedURLException, InterruptedException {
	  ChromeOptions op=new ChromeOptions();
	  Reporter.log("Test Executing on chrome",true);
	  WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),op);
	  Reporter.log("Diver session established with server",true);
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  Thread.sleep(10000);
	  Reporter.log("Test executng for amazon appliction",true);

	  System.out.println("Title is"+driver.getTitle());
	  driver.close();
	  Reporter.log("Test execution on  completed",true);
  }
}
