package myseleniumpractice;
/*------------WINODW IDS------------------
 * //windowids are used for switching in between the windowbrowser ,to do dat we have to first capture the windowid
 *  then use the winid for switching and get the title  
 * window ids changes randomly
 * 
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingwindowbrowser {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//getwindowhandle----------------returns single winodw id

		String windowid=driver.getWindowHandle();
		System.out.println("Id of the current window:"+windowid);

		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		Set<String> windowids=driver.getWindowHandles();           //window ids changes randomly

		//first method------iterator

      /*  Iterator<String>	it= windowids.iterator();
	    String parentwindowid=it.next();
	    String childwindowid=it.next();
	    System.out.println("id of the parent window is:"+parentwindowid);
	    System.out.println("id of the child window is:"+childwindowid);*/



		//second method-------converting set into list (using list/arraylist)

		//List<String> windowidslist=new ArrayList(windowids);
		/*String parentwinodwid=windowidslist.get(0);
	    String childwindow=windowidslist.get(1);


	    System.out.println("id of the paresnt:"+parentwinodwid);
	    System.out.println("id of the paresnt:"+childwindow);

		 //    how to use windows for switching

		  driver.switchTo().window(parentwinodwid);
		 System.out.println("title of the page is:"+driver.getTitle());


			driver.switchTo().window(childwindow);
			 System.out.println("title of the page is:"+driver.getTitle());*/


		//for each loop 

		for(String window:windowids)
		{
			//System.out.println("number of winodwids are:"+window); 

			String tilte=driver.switchTo().window(window).getTitle();
			System.out.println("title of the page windows are:"+tilte);
		}




	}
}
