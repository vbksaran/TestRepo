package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowserTest {
	public WebDriver driver;
	@Parameters({"bname"})
	@Test
	public void browserTest(String bname) throws InterruptedException, MalformedURLException {

		if (bname.equalsIgnoreCase("chrome")) {
			ChromeOptions op = new ChromeOptions();
			Reporter.log("Test Executing on "+bname , true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), op);
			Reporter.log("Diver session established with server", true);

		} else if (bname.equalsIgnoreCase("edge")) {
			EdgeOptions op = new EdgeOptions();
			Reporter.log("Test Executing on " +bname, true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), op);
			Reporter.log("Diver session established with server", true);

		} else if (bname.equalsIgnoreCase("firefox")) {
			FirefoxOptions op = new FirefoxOptions();
			Reporter.log("Test Executing on " +bname, true);
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), op);
			Reporter.log("Diver session established with server", true);

		}
		Thread.sleep(10000);
		Reporter.log("Test executing amazon appliction", true);

		
		driver.close();
		Reporter.log("Test execution on "+bname+"completed", true);

	}

}
