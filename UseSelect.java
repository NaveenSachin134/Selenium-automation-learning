package week2.assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseSelect extends BasePage {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.navigate().to(" http://leaftaps.com/opentaps/");
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.partialLinkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.id("accountName")).sendKeys("NAVEEN3");
		 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		 
		 driver.findElement(By.id("numberEmployees")).sendKeys("3");
		 driver.findElement(By.id("officeSiteName")).sendKeys("leaftaps");
		 //WebElement eb= driver.findElement(By.id("industryEnumId"));
		 WebElement j=driver.findElement(By.xpath("//select[@name='industryEnumId']"));
		 byVisible(j,"Computer Software");
		 byVisible(j=driver.findElement(By.xpath("//select[@name='ownershipEnumId']")),"S-Corporation");
		 byValue(j=driver.findElement(By.xpath("//select[@id='dataSourceId']")),"LEAD_EMPLOYEE");
		 byIndex(j=driver.findElement(By.id("marketingCampaignId")),6);
		 byValue(j=driver.findElement(By.id("generalStateProvinceGeoId")),"TX");
		 
		 
		 driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		 String a=driver.findElement(By.xpath("(//span[text()='Account Name']/following::td/span)[1]")).getText();
		 System.out.println(a.contains("NAVEEN3"));
		 
		 //System.out.println((driver.findElement(By.xpath("(//span[text()='Account Name']/following::td/span)[1]")).equals("NAVEEN3")));
		 driver.quit();
		 
		 
	}

}
