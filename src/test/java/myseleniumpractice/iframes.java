package myseleniumpractice;

import org.openqa.selenium.By;
/*----------FRAMES AND IFRAMES--------
 * normally frames are used for horizontal and vertical splitting of the screen.
 * iframes are used to embed the content of the external website into webpage in order to cross site scripting issued 
 * 
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframes {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     
     
     driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
     driver.manage().window().maximize();
     
    // driver.switchTo().frame("name of the frame/id of the frame");
    // driver.switchTo().frame("webelemnt");
    // driver.switchTo().frame("index");
     
     // 1st frame
   
     /* driver.switchTo().frame("packageListFrame");
     driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
     driver.switchTo().defaultContent();
     Thread.sleep(3000);
     
     
     //2nd framae
     
  /* driver.switchTo().frame("packageFrame");
     driver.findElement(By.xpath("//span[normalize-space()='ContextAware']")).click();
     driver.switchTo().defaultContent();
     Thread.sleep(3000);

     
     //3rd frame
     
     driver.switchTo().frame("classFrame");
     driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/li[7]/a[1]")).click();
     driver.switchTo().defaultContent();
     */
     
     
     //iframes 
     
    driver.get("https://demo.automationtesting.in/Frames.html");
     
    driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
 
     WebElement outerframe=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
     driver.switchTo().frame(outerframe);
    
    
  /* WebElement inneriframe= driver.findElement(By.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));
   driver.switchTo().frame(inneriframe); 
  
   WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
 
   input.sendKeys("automtion");
   Thread.sleep(3000);
   driver.quit();
     
     
     //iframes(parents and child)
     
     
     
    // driver.get("https://www.w3schools.com/tryit/tryit.asp?filename=tryhtml_hello");
     
     /*driver.switchTo().frame("iframeResult");                    //outerframe
     driver.switchTo().frame(0);                                //innerframe
     
     driver.switchTo().parentFrame();                        //switch back to parent frame and do the given task
     String text= driver.findElement(By.tagName("p")).getText();
     System.out.println("text present inside te iframe is:"+text);*/
     
     
     
     
  /*   
  WebElement   iframe=driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
  driver.switchTo().frame(iframe);
 WebElement text= driver.findElement(By.tagName("p"));
  
    System.out.println(text.getText()); */
     
     
     
     
     
	}

}
