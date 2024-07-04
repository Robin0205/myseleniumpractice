package myseleniumpractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class javautils {

	
		//method to highlight the border
		
		public static void drawborder ( WebElement element ,WebDriver driver ) { 
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].style.border=3px solid red'", element);
		}
			
			
		//method to get the title 
			
			public static String gettitleby ( WebDriver driver ) { 
				JavascriptExecutor js=(JavascriptExecutor)driver;
				String title=js.executeScript("retutn document.title;").toString();
			return title;
			}
			
		//click action by javascriptexceutor
			
			public static void clickelementbyjs ( WebElement element ,WebDriver driver ) { 
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("argument[0].click();", element);
				
			}
				
			//generatealert
			
			public static void generatealert ( WebDriver driver ,String message ) { 
				JavascriptExecutor js=((JavascriptExecutor)driver);
				js.executeScript("alert('"+message+"')");
			}
			
			//refresh winodw
			
			public static void refreshbrowserbyjs(WebDriver driver) {
			
				JavascriptExecutor js=((JavascriptExecutor)driver);
				js.executeScript("history.go(0)");
			
			
			}
			
			//scroolpagedown
			
			public static void scroolpagedown(WebDriver driver) {
				
				JavascriptExecutor js=((JavascriptExecutor)driver);
				js.executeScript("window.scroolTo(0,document.body.scroolHeight)");
			
			
			}
			
			//scroolpagedoen
			
              public static void scroolpageup(WebDriver driver) {
				
				JavascriptExecutor js=((JavascriptExecutor)driver);
				js.executeScript("window.scroolBy(0,-document.body.scroolHeight)");
			
              }
              
              //zooompageby
              
              
              public static void zoompageby(WebDriver driver) {
  				
  				JavascriptExecutor js=((JavascriptExecutor)driver);
  				js.executeScript("document.body.style.zoom=50%");
			
              }
              
              //flashwebelement 
              
              @SuppressWarnings("unused")
			public static void flashwebelement(WebElement element, WebDriver driver) throws IOException {
    				
            	  JavascriptExecutor js=((JavascriptExecutor)driver);
    				String bgcolor=element.getCssValue("backgroundcolour");
    				
    				for(int i=0;i<10;i++) {
    					
    				chnagecolor("#000000",element,driver);       //1
    				chnagecolor(bgcolor,element,driver);        //2
    					
    					
    				}
              }		
    				
    				
    			//chnagecolor
              
              public static void chnagecolor( String color, WebElement element, WebDriver driver) throws IOException {
    				
    				JavascriptExecutor js=((JavascriptExecutor)driver);
    				js.executeScript("argument[0].style.backgrndcolor='" + color + "'",element);
  				try {
  					Thread.sleep(20);
  				}
  				catch(InterruptedException e) {
  				}
  				
  				
  				
  				
  				
  				
  				//syntax
  				
  				//JavascriptExecutor js= (JavascriptExecutor)driver;
  				//js.executeScript(Script, args);
  				
  				
  			
  				
  				
  				//Drawing border& takes screenshot
  			 WebElement logo=driver.findElement(By.xpath("//header/nav[1]/div[2]/a[1]/img[1]"));
  			 javautils.drawborder(logo,driver);
  			 
  			 
  			 TakesScreenshot ts=(TakesScreenshot )driver;
  		   File	src= ts.getScreenshotAs(OutputType.FILE);
  		   File trg=new File(".\\screenshot\\logo.png");
  		 FileUtils.copyFile(src,trg);	
  				
  				
  				
  				
  				//getting alert
  				//click button
  				//generate alert//refreshing the page
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  						
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
  				
              }
}
    				
    				
    				
    				
    				
    				
    				
    				
    				
    				
    