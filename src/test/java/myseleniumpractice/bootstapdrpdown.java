package myseleniumpractice;

        //------------BOOSTSTRAP DROPDOWN-------


/*
 * it is a popular CSS framework  for developing responsive websites
 * to beauty controls(elements,links,checkboxex,radio  buttons, links)developers use booststrap framwwork
 * it is for represetning webelemets in beautiful manner.
 * links represting as a button (one of example)
 * 
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstapdrpdown {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException { // no select class is needed in bootstrap
																			// dropdown handling//
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
			driver.findElement(By.xpath("//*[@id=\"menu1\"]")).click();
			List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]//li"));
			//System.out.println("number of options are:"+alloptions.size());
			selectoptionsfromdropdown(alloptions, "CSS");
		

	}

	public static void selectoptionsfromdropdown(List<WebElement> alloptions, String value) {
		
		for (WebElement option : alloptions)
		{
			if (option.getText().equals(value))

				option.click();
			break;

		}
	}
}
