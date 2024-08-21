package week2.assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public static void  byValue(WebElement f, String S) {
		
		Select as=new Select(f);
		as.selectByValue(S);

	}
	
	public static void byVisible(WebElement f,String S) {
		Select as=new Select(f);
		as.selectByVisibleText(S);
	}
	public static void byIndex(WebElement f,int i) {
		Select as=new Select(f);
		as.selectByIndex(i);
	}
}
