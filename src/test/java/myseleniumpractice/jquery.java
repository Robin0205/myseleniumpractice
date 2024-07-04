package myseleniumpractice;

/*----------------JQUERY DROPDOWNS--------------


 * handling of dropdowns implemented by jquery,we cannot see the select tag  for this jquery dropdowns
 *  
 * 
 */

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquery {
	static WebDriver driver;

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {  
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
			driver.manage().window().maximize();
			driver.findElement(By.id("justAnInputBox1")).click();	    


			// selectchoicevalues(driver,"choice 2 1","choice 2 3");

			//selectchoicevalues(driver,"choice 6 2 1","choice 6 1","choice 2 3","choice 7");

			selectchoicevalues(driver,"all");


		}

	}		

	//(string,value)---to pass single value  (string...value)-- we can pass mulitple values
	//elements are not interactable means when the same xpath is macthing wid multiple elements in differet dropdowns bt we r using that xpath in single webelemnt it show dat excpetion.
	@SuppressWarnings("unused")
	public static void selectchoicevalues(WebDriver  driver, String... value)
	{
		List <WebElement>choicelist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

		if(!value[0].equalsIgnoreCase("all"))  // if no parameter value is equal to all passes will be selected  else print execute the all options
		{
			for(WebElement item:choicelist)

			{String text=item.getText();
			
			for(String val:value)
			{
				if(text.equals(val))
				{item.click();
				break;
				}

			}
			}
		}
		else
		{
			try {
				for(WebElement item:choicelist)
				{
					item.click();
				}


			}	
           	catch(Exception e){
           		e.printStackTrace();
           		e.getMessage();
           	}

			{	
			}			
		}													
	}										
}		

