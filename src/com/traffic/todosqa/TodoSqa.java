package com.traffic.todosqa;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TodoSqa {

	WebDriver driver = null;

	public TodoSqa() {
		/// traffic/utility/geckodriver.exe

		this.driver = new FirefoxDriver();
		String path = System.getProperty("user.dir");
		
		// the executable as above mentioned then doing this directly through code
		System.setProperty("webdriver.gecko.driver", path +"utility\\geckodriver.exe");
		// Now you can Initialize marionette driver to launch firefox
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
	}

	public void desdeNavegador() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			driver.navigate().to("http://www.todosqa.com");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='http://todosqa.com/testing-vs-qa/']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			driver.close();
		}

	}

	public void desdeGoogle() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {

			driver.navigate().to("http://www.gooogle.com");
			Thread.sleep(5000);
			driver.findElement(By.id("q")).sendKeys("testing vs qa todosqa");
			Thread.sleep(5000);

			driver.findElement(By.xpath("//a[@href='http://todosqa.com/testing-vs-qa/']")).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			// driver.close();
		}

	}

	public static void main(String[] args) {

		TodoSqa todosqa = new TodoSqa();
		String path = System.getProperty("user.dir");
		todosqa.desdeGoogle();

	}

}
