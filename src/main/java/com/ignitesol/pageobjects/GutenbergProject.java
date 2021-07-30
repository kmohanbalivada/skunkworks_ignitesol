package com.ignitesol.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ignitesol.testbase.TestBase;

public class GutenbergProject extends TestBase{


	public GutenbergProject() {
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath = "//span[contains(text(),'FICTION')]")
	WebElement button_Fiction;
	@FindBy(xpath = "//span[contains(text(),'DRAMA')]")
	WebElement button_Drama;
	@FindBy(xpath = "//span[contains(text(),'HUMOR')]")
	WebElement button_Humor;
	@FindBy(xpath = "//span[contains(text(),'POLITICS')]")
	WebElement button_Politics;
	@FindBy(xpath = "//span[contains(text(),'PHILOSOPHY')]")
	WebElement button_Philosophy;
	@FindBy(xpath = "//span[contains(text(),'HISTORY')]")
	WebElement button_History;
	@FindBy(xpath = "//span[contains(text(),'ADVENTURE')]")
	WebElement button_Adventure;


	//related methods

	public void clickOnButton(String button_name)  {
		if(button_name.equalsIgnoreCase("FICTION")) 
			button_Fiction.click();
		
		else
			if(button_name.equalsIgnoreCase("DRAMA"))
				button_Drama.click();
			else
				if(button_name.equalsIgnoreCase("HUMOR"))
					button_Humor.click();
				else
					if(button_name.equalsIgnoreCase("POLITICS"))
						button_Politics.click();
					else
						if(button_name.equalsIgnoreCase("PHILOSOPHY"))
							button_Philosophy.click();
						else
							if(button_name.equalsIgnoreCase("HISTORY"))
								button_History.click();
							else
								if(button_name.equalsIgnoreCase("ADVENTURE"))
									button_Adventure.click();
	
	}
	


}
