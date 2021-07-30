package com.ignitesol.reusablecomponents;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.ignitesol.testbase.ObjectRepository;

public class ListnerImplementation extends ObjectRepository implements ITestListener {

	public void onTestStart(ITestResult result) {
		obj_test=obj_extent.createTest(result.getMethod().getMethodName());
		obj_test.log(Status.INFO,"TestCase: "+result.getMethod().getMethodName()+" started");
		
	}

	public void onTestSuccess(ITestResult result) {
		obj_test.log(Status.PASS,"TestCase: "+result.getMethod().getMethodName()+" PASS");
				
	}

	public void onTestFailure(ITestResult result) {
		obj_test.log(Status.FAIL,"TestCase: "+result.getMethod().getMethodName()+" FAIL");
		
		//taking screenshots
		TakesScreenshot tsc=(TakesScreenshot)driver;
		File f= tsc.getScreenshotAs(OutputType.FILE);
		try{
		FileUtils.copyFile(f, new File(System.getProperty("user.dir")+"\\ScreenShots\\"+result.getMethod().getMethodName()+"-test fail"));
		}catch(IOException e) {
			obj_test.log(Status.INFO,"screenshot: "+result.getMethod().getMethodName()+" file not found");
		}
	}

	public void onTestSkipped(ITestResult result) {
		obj_test.log(Status.SKIP,"TestCase: "+result.getMethod().getMethodName()+" SKIPPED");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		obj_extent=ExtentReportSetup.extentReportSetup();
		
	}

	public void onFinish(ITestContext context) {
		obj_extent.flush();
		
	}
	
	

}
