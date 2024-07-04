package myseleniumpractice;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class jdbc {

	
	/*public static void main(String[] args) throws InterruptedException, SQLException {
		
		//Data
		
		String cust_firstname="John";
		String cust_lastname="kenedy";
		String cust_email="john@gmail.com";
		String cust_telephone="1234567890";
		String cust_password="john123";
		

		//user Registration
		
	/*WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();

	Thread.sleep(7000);
	
	
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("michel");
	driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[1]")).sendKeys("ms");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("michel789@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Michel@789");
	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();

	
	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
	
	try {

	
	String confirmmsg=driver.findElement(By.xpath("//h1[normalize-space()='Your Account Has Been Created!']")).getText();
	
	if (confirmmsg.equals("Your Account Has Benn Creayed!"))
		{System.out.println("Registartion sucessfuk from the UI/Application");
	}
	else
	{
		System.out.println("Registartion not sucessfl");
	}
	
	}
	catch (Exception e)
	{
	System.out.println("some problem in the application");
	
	}*/

	
	//Database connection
	
	/*Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/openshop", "root","root");
	
	Statement stmt=con.createStatement();
	String query=("select firstname,lastname,email,telephone from oc_customer");
	ResultSet rs=stmt.executeQuery(query);

	boolean status=false;
	
	while(rs.next())
	{
	
			String firstname=rs.getString("firstname");
			String lastname=rs.getString("lastname");
			String email=rs.getString("email");
			String telephone=rs.getString("telephone");
			
			
			if(cust_firstname.equals(firstname)&&cust_lastname.equals(lastname)&&cust_email.equals(email)&&cust_telephone.equals(telephone))
			
			
			{
				System.out.println("record found in the tabel || test passed");
				status=true;
			}
	}
	
	if(status==false)
	{
	System.out.println("Record not found|| test faild");
	}
			

	*/
	
	
}
			
			
			
			
			
			
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	