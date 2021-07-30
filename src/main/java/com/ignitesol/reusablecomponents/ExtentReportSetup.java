package com.ignitesol.reusablecomponents;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ignitesol.testbase.ObjectRepository;

public class ExtentReportSetup extends ObjectRepository{
	
	public static ExtentReports extentReportSetup() {
	
		obj_extent = new ExtentReports();
	    obj_spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\reports.html");
	    obj_extent.attachReporter(obj_spark);
	    
	    obj_spark.config().setDocumentTitle("SkunkWorks");
	    obj_spark.config().setTheme(Theme.DARK);
	    obj_spark.config().setReportName("Test Report");

	return obj_extent;
	
	}

}
