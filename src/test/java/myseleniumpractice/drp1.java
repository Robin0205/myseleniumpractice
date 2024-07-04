package myseleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//DROP DOWN 
/* select is a class that is present  inside the webdriver that is used to select the web options.Inside the webdriver in select  cls there are 3 methods
 * by which we can select the options they are
 * 1.select by visible text  2.select by value 3.select by index
 * 
 */

public class drp1 {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
	//GENERAL METHODS THAT  ARE PRESENT  IN SELECT CLASS BY WHICH WE CAN SELECT OPTIONS FROM DROPDOWN
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		
	 Select dropdown=new Select(null);
	
	  dropdown.selectByVisibleText("Argentina");
	 //dropdown.selectByValue("AB-VT");
	 //dropdown.selectByIndex(10);
	// Thread.sleep(3000);
	// driver.close();
		
		
		
	//selction of web option from dropdown without using select class methods
		
	 WebElement element=driver.findElement(By.xpath("//select[@id='animals']"));
		Select drp=new Select(element);
	List<WebElement>alloptions=drp.getOptions();
	
		
		
		for(WebElement option:alloptions) {
			
		if	(option.getText().equals("Avatar"));
		{
		    option.click();
			break;	
			
		}
				}
			}
}
