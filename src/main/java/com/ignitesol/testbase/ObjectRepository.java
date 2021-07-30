package com.ignitesol.testbase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ignitesol.pageobjects.Books;
import com.ignitesol.pageobjects.GutenbergProject;


public class ObjectRepository {
	
	public static WebDriver driver;
	
	public static String masterWindow;
	
	public static ExtentReports obj_extent;
	public static ExtentSparkReporter obj_spark;
	public static ExtentTest obj_test;
	
	public static GutenbergProject obj_GutenbergProject;
	public static Books obj_Books;

}
