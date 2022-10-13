package locatorinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locatorinselenium {
	@Test
public void IDDemo() {
	System.setProperty("webdriver.chrome.driver"
			,"D:\\ECLIPSE dxc phase 2\\DXCLaunchChrome\\SeleniumChromeBrowserJars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123"); //User can use thier own password or thier own CREDS.
	driver.findElement(By.id("btnLogin")).click();
	
	
}
}
