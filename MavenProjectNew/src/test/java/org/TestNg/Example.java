package org.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example {
	static WebDriver driver;
	@Parameters({"username","userpass"})
	@Test
private void testOne(String username, String userpass) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://WWW.facebook.com/");
		driver.manage().window().maximize();
		String currentUrl =driver.getCurrentUrl();
		System.out.println("url from address bar:"+currentUrl);
		String title =driver.getTitle();
		System.out.println("title of the page:"+title);
		WebElement userName =driver.findElement(By.xpath("(//input[@name='email'])"));
		userName.sendKeys(username);
		//Assert.assertEquals("6380999520",userName.getAttribute("value") );
		WebElement userPass = driver.findElement(By.xpath("(//input[@name='pass'])"));
		userPass.sendKeys(userpass);
		//Assert.assertEquals("770870",userPass.getAttribute("value") );
		//driver.findElement(By.xpath("(//button[@name='login'])")).click();

}
}
