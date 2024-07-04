package myseleniumpractice;

/* //locators   (id,name.tagname,ClassName,linkText,partiallinkText)   
 * we can identify various elemets on the web using locators.
 * locators are the adresses that identify a web element uniquely within the web page.
 * Dom(Document Object Model) structure created by the browser during browsing. 
 * 
 *---------LOCATORS rae of 2 types 1.LOCATORS 2.CUSTOMIZED locators                
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {        
		
		
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.google.com/");
		 driver.navigate();
			
		

		 driver.findElement(By.id(""));
		 driver.findElement(By.name(""));
		 driver.findElement(By.tagName(""));
		 driver.findElement(By.className("gNO89b"));
		 driver.findElement(By.linkText(""));
		 driver.findElement(By.partialLinkText(""));


		
		
     //customized locators are extended into 2 types
     //1.(css selector) (tag#id, tag.class[Attribute=value], tag,-class Attribute)
		
		 
		 
	 //tag and id combination
     driver.findElement(By.cssSelector("#email"));      
     driver.findElement(By.cssSelector("input#email")); 
     
     //tag and class combination
     driver.findElement(By.cssSelector(".inputtext")); 
     driver.findElement(By.cssSelector("input.inputtext"));

     //tag and attribute combination
     driver.findElement(By.cssSelector("[name=email]")); 
     driver.findElement(By.cssSelector("input[name=email]"));
     
     
     //tag class and attribute combination
     driver.findElement(By.cssSelector("input.inputtext[data=data.testid=royal_email]")); 
     
     
     
     
     
     //  sytax of absolute xpath(it uses nodes and tags)
     
     driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
     
     // syntax of the relative xpath(it uses only attributes)   //tagname[@attribute=value]
     driver.findElement(By.xpath("//input[@name=q]"));
    
     
     
      /*xpath is defined as a XML path 
      * it is a syntax or languauge for finding element on the web page using xml path expressiions
      * xpath is used to find the location of any element on webpage using HTML DOM strucutre
      * DOM (document object module) is a API interface provided by browser
      * xpath can used to navigate through elements and attributes in DOM.
      * 
      * ---------TYPES OF XPATHS-------
      * 1.Absolute xpath
      * it will go through every node until the web elemnt finds
      * absolute xpath starts with/
      * it use only nodes and tags
      *

     
      * 2.Realtive xapth
      * it directly jumps to element on DOM
      * relative xpath satrts with//
      * it uses attributes
      * 
      *  we can capture xpaths  by
      *  
      *  right click--inspect--highlight html--right click--copy xpath
      *  chropath extension
      *  selectorhub
      *  we should prefer relative xpath only,because in future when the nodes in between changes we may not found the element that we need to locate
      */   
    
      
     
     //there are different xpath options are used they are
     //  or,and,contains(),starts with(),text(),chained xapth
     
     //or operator (any one of the attribute should match)
     driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query']"));
     
     
     //and opeartor(both the attributes should match)
     driver.findElement(By.xpath("//input[@type='text' and @class='gLFyf gsfi']"));
     
    //contains() //tagname[contains(@attribute,'value')]             //dynamic xpath
     
     driver.findElement(By.xpath("//input[contains(@name,'bt')]"));
     
     
     //starts with //tagname[starts-with(@attribute,'value')]        //dynamic xpath
     driver.findElement(By.xpath("//input[starts-with(@class,'nav_)]"));
     
     //chained xpath
     
     driver.findElement(By.xpath("//form[@id='search_box']//button)"));
     driver.findElement(By.xpath("//form[@id='search_box']//button[@name='subit_search']")); //parent and child
     
     
     //Xpath with text
     
     driver.findElement(By.xpath("//a[text()='women']")).click();
     
     //a[contains(text(),'India Tourism')];   //to locate with the help of text
     
     //xpath Axes 
 /*xpath axes are those axes that are used to search for the multiple nodes in XML document from current node context.These methods are mainly 
  used when the web element is not identified with the help of id,name,class,linktext,partialtext,absolute xpath,relative css selector. 
 */
     
     
      

	}

}
 