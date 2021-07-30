package com.ignitesol.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.ignitesol.testbase.TestBase;

public class Books extends TestBase {
	public Books() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='outlined-full-width']")
	WebElement text_Search;
	
	@FindBy(xpath ="//span[contains(text(),'Search')]")
	WebElement button_search;
	
	@FindBy(xpath = "//h1")
	WebElement title;
	
	//related methods
	
	//checking the page title
	public void check_PageTitle(String expected_Title) {
		
		String actual_Title=title.getText();
		
		Boolean expected=true;Boolean actual=false;
		
		if(expected_Title.equalsIgnoreCase(actual_Title)) {
			actual=true;
		}else {
			System.out.println("expected page ="+expected_Title);
			System.out.println("expected page ="+actual_Title);
		}
		Assert.assertEquals(expected,actual);
		
		
	}
	
	//checking the search
	public void search_Text(String search_Book) {
		text_Search.sendKeys(search_Book);
	    button_search.click();
	  
	    Boolean expected=true;Boolean actual=false;
	List<WebElement> searched_Books=driver.findElements(By.xpath("//a/h5"));
	for(WebElement i:searched_Books) {
		//System.out.println(i.getText());
		if(i.getText().contains(search_Book)) {
			
			actual=true;
			break;
		}
		
	}
	Assert.assertEquals(expected,actual);
	}
	
	

}
