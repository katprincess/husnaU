package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// to open a browser we need to create a set property with webdriver.chrome.driver and write the location/path of the chrome driver.
		// make an obj of web driver.
		
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.objectspy.com/register/studentportal/index.php");
		// to maximize window we have to manage it, then windows, them maximize.
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
