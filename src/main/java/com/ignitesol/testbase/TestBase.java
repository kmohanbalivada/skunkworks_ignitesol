package com.ignitesol.testbase;

import java.awt.print.Book;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.Status;
import com.ignitesol.pageobjects.Books;
import com.ignitesol.pageobjects.GutenbergProject;
import com.ignitesol.reusablecomponents.PropertiesSetup;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase extends ObjectRepository {

	@BeforeTest
	public void invokeBrowser() throws InterruptedException {

		String browser=PropertiesSetup.propertiesSetup("browser");
		String url=PropertiesSetup.propertiesSetup("url");

		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else 
			if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}else
				if(browser.equalsIgnoreCase("ie")) {
					WebDriverManager.iedriver().setup();
					driver=new InternetExplorerDriver();
				}else
					if(browser.equalsIgnoreCase("edge")) {
						WebDriverManager.edgedriver().setup();
						driver=new EdgeDriver();
					}
				else {
					obj_test.log(Status.INFO, "it supports only chrome,firefox and ie");
				}

		Thread.sleep(5000);
		driver.get(url);
		masterWindow=driver.getWindowHandle();
		obj_GutenbergProject=new GutenbergProject();
		obj_Books=new Books();

	}
	@AfterTest
	public static void closeBrowser() {
		driver.close();

	}

}
