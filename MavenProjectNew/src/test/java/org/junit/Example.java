package org.junit;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	static WebDriver driver;	
	@BeforeClass
public static void beforeClass() {
	System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://WWW.facebook.com/");
		driver.manage().window().maximize();
		String currentUrl =driver.getCurrentUrl();
		System.out.println("url from address bar:"+currentUrl);
		String title =driver.getTitle();
		System.out.println("title of the page:"+title);
		//Assert.assertTrue("Verify the title:", driver.getCurrentUrl().contains("log in")); //Not Working
		//Assert.assertTrue("Verify the url:", driver.getTitle().contains("face"));

	}
@Before 
public void beforeMethod() {
		Date d = new Date();
		System.out.println("Date:"+d);
		System.out.println("BeforeMethod");

	}
@Test
public void test() {
	System.out.println("Test");
	WebElement userName =driver.findElement(By.xpath("(//input[@name='email'])"));
	userName.sendKeys("6380999520");
	//Assert.assertEquals("6380999520",userName.getAttribute("value") );
	WebElement userPass = driver.findElement(By.xpath("(//input[@name='pass'])"));
	userPass.sendKeys("770870");
	//Assert.assertEquals("770870",userPass.getAttribute("value") );
	driver.findElement(By.xpath("(//button[@name='login'])")).click();

}
@After
public void afterMethod() throws IOException {
	System.out.println("After Method");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File source = tk.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Asus\\Desktop\\screenshot\\junit.jpg");
	FileUtils.copyFile(source, dest);

}
@AfterClass
public static void afterClass() {
	System.out.println("After Class");
	driver.quit();

}
	}


