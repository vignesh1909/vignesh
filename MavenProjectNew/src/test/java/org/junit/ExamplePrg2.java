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

public class ExamplePrg2 {
	static WebDriver driver;

@BeforeClass
public static void beforeClass() {
	System.out.println("Before Class");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://WWW.redbus.in/");
	driver.manage().window().maximize();
	String currentUrl = driver.getCurrentUrl();
	System.out.println("url from address bar:"+ currentUrl);
	String title = driver.getTitle();
	System.out.println("Title of the page:"+title);

}
@Before
public void beforeMethod() {
	System.out.println("Before Method");
	Date d = new Date();

}
@Test
public void test() {
	//Actions act = new Actions(driver);
	driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
	driver.findElement(By.xpath("//li[@id='signInLink']")).click();
	driver.findElement(By.xpath("//span[@class='nsm7Bb-HzV7m-LgbsSe-BPrWId']")).click();
	driver.findElement(By.xpath("//div[text()='Use another account']")).click();
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("vigneshkasi19@gmail.com");
	driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7708706332");
	driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();

}
@After
public void afterMethod() throws IOException {
	System.out.println("After Method");
	TakesScreenshot tk = (TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Asus\\Desktop\\screenshot\\junitp2.jpg");
	FileUtils.copyFile(src, dest);

}
@AfterClass
public static void afterClass() {
	System.out.println("After Class");
	driver.quit();

}
}
