package myseleniumpractice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cookies {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//how to get cookies from browser
		
	 Set<Cookie> cookies=driver.manage().getCookies();
	System.out.println("size of the cookies:"+cookies.size());
	
	
	
	//how to add cookies to browser
	
	Cookie cookienew=new Cookie("Mycookie123" ,"123456");
	driver.manage().addCookie(cookienew);
	
    cookies=driver.manage().getCookies();
	System.out.println("all cookies after adding:"+cookies.size());
	
	for(Cookie cookie:cookies)
	{
		System.out.println(cookie.getName()+"  :  "+cookie.getValue());

	}
	
	//  how to deleting the cookie by passing ( cookie object)
	
	
    driver.manage().deleteCookie(cookienew)	;
    
    
    cookies= driver.manage().getCookies();
    System.out.println("no of cookies after deleting cookies that added:"+cookies.size());
    
    // how to delete cookies by passing cookie name
    
    driver.manage().deleteCookieNamed("Mycookie123");
    cookies=driver.manage().getCookies();
    System.out.println("size of oookies after deleting the cookie by cookie name:"+cookies.size());
    
    
    //delete all cookies
    
    driver.manage().deleteAllCookies();
 cookies =driver.manage().getCookies();
 System.out.println("no of all cookies deleting all cookies:"+cookies.size());
	
	

	}
}

