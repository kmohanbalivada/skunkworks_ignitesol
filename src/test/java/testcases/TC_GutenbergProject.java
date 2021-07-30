package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.ignitesol.testbase.TestBase;


public class TC_GutenbergProject extends TestBase {
	
	//this test case to check weather the buttons hi the "GutenbergProject" page are navigating the respective pages are not
	@Test(priority = 0)
	public static void tc_01() {
		obj_test.log(Status.INFO,"- check the navigation of the buttons");
		List<String> catagory_list=new ArrayList<String>();  
		 //Adding elements in the List  
		catagory_list.add("FICTION");catagory_list.add("DRAMA"); catagory_list.add("HUMOR");  catagory_list.add("POLITICS");catagory_list.add("PHILOSOPHY");  catagory_list.add("HISTORY");  catagory_list.add("ADVENTURE");
		 
		 for(String catagory:catagory_list) {
			
			 obj_GutenbergProject.clickOnButton(catagory);
			
			 obj_Books.check_PageTitle(catagory);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.navigate().back();
		 }
	}
	
	
	//this test case is to search the book
	/*@Test(priority = 1)
	public static void search() {
		obj_test.log(Status.INFO,"- to check the search");
		obj_GutenbergProject.clickOnButton("FICTION");
		//obj_Books.search_Text("Adventures");
		
		
	}*/

}
