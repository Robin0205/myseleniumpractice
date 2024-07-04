package myseleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class staticwebtable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingo.com/handle-static-web-table-in-selenium/");
		
		
		//To count toal number of rows in static table
	
		int rows=driver.findElements(By.xpath("//table/tbody/tr")).size();
		//System.out.println("totoal number of rown in static table are:"+rows);
		
		//To count total number of colums in statictable
		
		int colums=driver.findElements(By.xpath("//table/tbody/tr/th")).size();
		//System.out.println("totoal number of rown in static table are:"+colums);
		
		//to get the specific value in rows and colums
		
		
		//String value=driver.findElement(By.xpath("//*[@id=\"genesis-content\"]/article/div[2]/table/tbody/tr[3]/td[1]")).getText();
	//	System.out.println("text of the specific colum:"+value);
		
		
		
	     //To get  all rows and coulums
		
	
		for(int r=2;r<=rows;r++)
		{
			
			for(int c=2;c<=colums;c++)
			{
				String data=driver.findElement(By.xpath("//table/tbody/tr[\"+r+\"]/td[\"+c+\"]")).getText();			
				System.out.println(data);

			}
		
		System.out.println();
		
		}	
		
		
		driver.quit();
		
		
		
		
		//print version no of java and release date of java(conditional)
		
		
	/*	
		for(int r=1;r<=rows;r++)
			
		{
			String language=driver.findElement(By.xpath("//table/tbody/tr[\"+r+\"]/td[1]")).getText();
			
			if(language.equals("java"))
				
			{
				String author=driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[2]")).getText();
			
				String subject=driver.findElement(By.xpath("//table/tbody/tr["+r+"]/td[3]")).getText();
				
				System.out.println(language+"   "+author+"      "+subject);
				
			
			
			
		
		}
		}*/
	}
}
		
		
	

		
	

		
		
		
		
		
		
	
	


