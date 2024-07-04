package myseleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxs {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.get("https://itera-qa.azurewebsites.net/home/automation");
    driver.manage().window().maximize();
    
    //selecting the single checkbox
 /*   
    driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div[4]/label")).click()));
    
    Thread.sleep(3000);
    driver.close();*/
    
    
    
    
     List<WebElement>  checkboxes= driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id, 'day')]"));
     checkboxes.size();
     System.out.println("total number of checkboxes:"+checkboxes.size());
       
       
       
       //using loop
  /*    for(int i=0;i<=checkboxes.size();i++)
    	   
       {
    	   checkboxes.get(i).click();
    	   
       }  
       
       //using for..each loop(enhanced forloop)
   
   for(WebElement checkbox:checkboxes)
   {
	   checkbox.click();
    
	}
*/  
        //selection of checkboxes based on choice (randomly)
       
       for(WebElement checkbox:checkboxes)
    	   
       {
    	   String checkboxname=checkbox.getAttribute("id");
    	   if(checkboxname.equals("monday") || checkboxname.equals("sunday") || checkboxname.equals("thursday"))
    		   checkbox.click();
    	   
   
       
    	  //selection of first 2 checkboxes 
       
       
         // int totalchekbox=checkboxes.size();
    	   /*
    		   
    		   for(int i=totalchekbox-3;i<totalchekbox;i++);
    	   {
    		   
    	     checkboxes.get(i).click();
    			   
    			 
     }*/
       
    	 //selection of checkboxes want to select =last 2 checkboxes
       
 /*      
       
               for(int i=0;i<checkboxes.size();i++)
            	   
            	   if(i>3)
    	   
       {
    	   checkboxes.get(i).click();
    	   
       }  
       
       
       */
       
       
       }
	}
	
}
         		   
        
       
	

       
	




	
	


