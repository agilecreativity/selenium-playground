package com.agilecreativity.automation;


import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

public class FirefoxDriverTest extends TestCase {
	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		Properties props = new Properties();
		try {
			props.load(FirefoxDriverTest.class.getResourceAsStream("/default.properties"));

			String[] configKeys = new String[] { "webdriver.firefox.bin", "webdriver.firefox.port" };

			for (String k : configKeys) {
				System.setProperty(k, props.getProperty(k));
			}
			driver = new FirefoxDriver();
		} catch (IOException e) {
			// TODO: handle this properly
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			// TODO: handle this properly
			e.printStackTrace();
			throw e;
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testGoogleSearch() throws Exception {
		System.out.println("Begin simple Google search...");
		driver.get("https://www.google.com/webhp?gws_rd=ssl");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Assert.assertEquals("Google", driver.getTitle());
	}
}
