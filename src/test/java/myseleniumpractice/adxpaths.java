package myseleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adxpaths {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// we are using topgainers website to locate this elements

		// xpath axes are used to located the multiple elements from present node

		driver.findElement(By.xpath("//a[contains(text(),'india Tourism']/self::a")); // self   --select the current node
		driver.findElement(By.xpath("//a[contains(text(),'india Tourism']/parent::td")); // parent   --select the parent of the current node
		driver.findElement(By.xpath("//a[contains(text(),'india Tourism']/child::*"));   //Child--select the child of the present node
		// If we want to know the childs of the present node we have to use this syntax

		List<WebElement> total = driver.findElements(By.xpath("//a[contains(text(),'india Tourism']/ancestor::tr/child::td"));
		// naviagting to ancestor element from the self node and finding the child
		// elements to the ancestor node
		System.out.println("Total num of child classes are" + total.size()); // with this we can know the number of
																				// child elements to the ancestor node

		// Ancestor (Select all the ancestors  ---parent and grand parent)

		String text = driver.findElement(By.xpath("/a[contains(text(),'india Tourism']/ancestor::tr")).getText();
		System.out.println(text);
		
		//Descendent (select all the descendent --child,grandchild from the current node)
		
		List<WebElement> des=driver.findElements(By.xpath("/a[contains(text(),'india Tourism']/ancestor::tr/descendent::td"));
             System.out.println(des.size());   //Total number of descendent child 
             
             for( WebElement n:des)
             {
            	System.out.println( n.getText());            //to get the text of every child eleent.
             }
             
             //Following --select everything in the html document after  the closing  tag of current node
             
             List<WebElement> all=driver.findElements(By.xpath("/a[contains(text(),'india Tourism']/ancestor::tr/following::tr"));
             System.out.println("Total num of following nodes are"+all.size());
             
             //Following-Siblings---select all siblings after the current node
             
             List<WebElement>fs=driver.findElements(By.xpath("/a[contains(text(),'india Tourism']/ancestor::tr/following-siblings::tr"));
             System.out.println("Total number of following siblings are"+fs.size());
             
             //preceeding---select all the nodes that appear before the currenr node in the document
             List<WebElement>pp=driver.findElements(By.xpath("/a[contains(text(),'india Tourism']/ancestor::tr/preceeding::tr"));
             System.out.println("Total number of preceeding nodes are are"+pp.size());
             
             //preceeding-siblings---select all the preceedings after the current node
             
             List<WebElement>ps=driver.findElements(By.xpath("/a[contains(text(),'india Tourism']/ancestor::tr/preceeding-sibling::tr"));
             System.out.println("Total number of preceeding-sibling nodes are are"+ps.size());
             
             
             
             
             
             
             //Find the sign up button from the registration from from Facebook application(child)
             
             //div[@id='reg_from_box']/child::div[10]/button     ----------Here Registration form is the parent inside that sign button is the child
             
             
             //Locate the firstname field from signup button in facebook  (child)
             //button[@id='u_0_13)']/parent::*/parent::*/child::div[1]/div[1]---first we need to locate parent(Sign up) then we needto locate child(First name)
             
             
             //Identify the password from the mobile number field in facebook(Following)
             //button[@id='u_0_13)']/following::input

             

             //Identify the mobile number from password field in facebook(preceeding)
             //button[@id='password_step_input)']/preceeing::input[2]
             
             
             //Locate the surname from the female radio button in facbook (Ancestor)
             //input[@id='u_0_4']/ancestor::div[2]/div[1]/div/div[2]
             
             
     //Identify the google search  tex box from the google search button present in the Google seacrh home page (Parent)
     //div[@class='FPdoLc tfBOBf']/parent::*/parent::*/parent::*/div[1]  
             
             
             
    //Identify the todays deal link from amazon search text box present in the amazon home page (Following)
    //input[@id='twotabsearchtextbox']/following::a[contains(text(),'Today's Deals')]
             
             
             
    //Identify hello,Sign from amazon search text box present in the amazon home page
    ///input[@id='twotabsearchtextbox']/following::span[contains(text(),'Hello, Sign in')]
             
             
    //Idetify the mobile link which is part of meu bar-Amazon   (Descendent)
    //div[@id='nav-xshop']/descedent::a[contains(text(),'Mobiles')}         
             
             

	}

}
