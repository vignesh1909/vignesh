package org.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleClass {

	public static void main(String[] args) {
		BaseClass b = new BaseClass();
		WebDriver ChromeDriver = b.getChromeDriver();
		b.loadurl("https://www.facebook.com/");
		
		WebElement textuserName = ChromeDriver.findElement(By.name("email"));
		b.textBox(textuserName, "6380999520");
		
		WebElement textpassName = ChromeDriver.findElement(By.name("pass"));
		b.textBox(textpassName, "770870");
		
		WebElement login = ChromeDriver.findElement(By.xpath("//button[text()='Log In']"));
		b.btnClcik(login);

	}

}
