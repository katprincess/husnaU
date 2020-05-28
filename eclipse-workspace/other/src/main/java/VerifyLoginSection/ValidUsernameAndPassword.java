package VerifyLoginSection;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidUsernameAndPassword {
	@Test
	public void testingLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\icest\\eclipse-workspace\\other\\driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.demo.guru99.com/V4/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		d.findElement(By.name("uid")).sendKeys("mngr258243");
		d.findElement(By.name("password")).sendKeys("UhUtehy");
		d.findElement(By.name("btnLogin")).click();
		
		d.close();
		d.quit();
	}

}
