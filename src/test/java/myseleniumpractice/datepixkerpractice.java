package myseleniumpractice;
/*there are 2 types of date pickers are there they are 1.through date table 2.dropdown box
 * 
 */

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepixkerpractice {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("https://www.redbus.in/");                                //RED BUS//
		driver.manage().window().maximize();
		
		String month="Nov";
		String year="2022";
		String date="25";

		driver.findElement(By.xpath("//input[@readonly='readonly']")).click();
		
		while(true)
		{
		String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();       //monthyear
		String	 array[]=monthyear.split(" ");
		 String mon=array[0];
		 String yr=	array[1];
		 
		 if(mon.equalsIgnoreCase(month)&&yr.equalsIgnoreCase(year))
		 break;
		 
		 else
	driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
			
		}
	List<WebElement>alladates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tbody/tr/td"));     //alldates
		
		for(WebElement element:alladates)
		{
			String dt=element.getText();                                               //expecteddate
		
		if(dt.equals(date))
		{element.click();
		break;
		}
		
		}*/
		
		
	            //DUMMYTICKET
		
		driver.get("https://www.dummyticket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section[1]/div/div/div/div/div/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
		Select month=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")));
	    month.selectByVisibleText("Mar");
	    Select year=new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"))); 
		year.selectByValue("1998");
		
		String date="2";
		
	List <WebElement>	alldates=driver.findElements(By.xpath("//tbody/tr/td"));
	
	for(WebElement element:alldates)
		
	{
	String dt=element.getText();
	
	if(dt.equals(date))
		
	{element.click();
	break;
	}
	
	}
	}
}
	
		
	
		
		
		
		



