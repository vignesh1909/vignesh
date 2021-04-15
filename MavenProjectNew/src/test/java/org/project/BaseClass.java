package org.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	
	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	  }
	public void loadurl(String url) {
		driver.get(url);
		}
	public void textBox(WebElement element, String Name) {
		element.sendKeys(Name);
		}
	public void btnClcik(WebElement Clickaction) {
		Clickaction.click();
        }
	public void quitBrowser() {
		driver.quit();
        }
	public void closeBrowser() {
		driver.close();

	}

}
