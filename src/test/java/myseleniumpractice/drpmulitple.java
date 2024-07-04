package myseleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

//generic methods(user generic methods) for selecting  options from dropdown

public class drpmulitple {

	static WebDriver driver;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//consider for example we have 3 dropdowns that listed below

		WebElement element1=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		selectoptionformdropdown(element1,"Algeria" );
		WebElement element2=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		selectoptionformdropdown(element2,"Bermuda" );
		WebElement element3=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		selectoptionformdropdown(element3,"Cayman Islands" );

		//generic method  by passing values in choosen ooptions is selected


	}
	public static void selectoptionformdropdown(WebElement element , String value) {

		{

			Select drpcountry=new Select(element);
			List <WebElement> alloptions=drpcountry.getOptions();


			for (WebElement drp:alloptions)
			{

				if(drp.getText().equals(value))
				{
					drp.click();
				}



			}

		}
	}



}

















