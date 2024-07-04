package myseleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*---------------NAVIGATION-------
 * navigate.back()---
 * navigate.forword()--
 * navigate.refresh()--
 * navigate.to()--
 * 
 *  
 * difference between the get and navigate().to(); method is 
 * get()  method is used to navigate particular URL (website) and wait until the page load.driver.
 * navigate().to(); method  is used to navigate to particular URL and does not wait until the page load 
 * it maintains the browser history or cookies to navigate  back or forword. 
 */

public class navigation {
	
	
	
	public static void main(String args[] ){
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
	    driver.navigate().to("https://www.amazon.in/");
	    driver.get("https://www.snapdeal.com/");
	    
	    
	    //navigate  to url
	    driver.navigate().to("");
   
	    //navigate.back()
	    driver.navigate().back();
	    
	    
	    //navigate.forword();
	    driver.navigate().forward();
	   
	    
	    //navigate().refresh();
	    driver.navigate().refresh();
		
	}

}


