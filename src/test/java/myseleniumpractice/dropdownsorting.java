package myseleniumpractice;

//SORTING  DROPDOWN WEBOPTIONS//

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class dropdownsorting {

	@SuppressWarnings({ "unused", "rawtypes", "unchecked",  })
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement alloptions=driver.findElement(By.id("searchDropdownBox"));

		Select drpselect=new Select(alloptions);
		List<WebElement> options=drpselect.getOptions();

		ArrayList originallist=new ArrayList();   //collection
		ArrayList templist=new ArrayList();       //collection

		for(WebElement option:options)
		{
			originallist.add(option.getText());
			templist.add(option.getText());

		}




		System.out.println("originallist before soerting:"+originallist);
		System.out.println("templist before sorting:"+templist);
		Collections.sort(templist);                                 

		
		if(originallist.equals(templist))
		{
			System.out.println("dropdown sorted");

		}
		else
		{System.out.println("dropdown unsorted");
		}

	}	

}		





