package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tabs");
		
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
	    
	    System.out.println("Page Title is :  "+driver.getTitle());
	    driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
	    //Print The handle of current tab
	    System.out.println("Current tab Handle : "+driver.getWindowHandle());
	    //Print all window handles
	    System.out.println("All window Handles : "+driver.getWindowHandles()); 
	    //Wait for new window to open
	    wait.until(ExpectedConditions.numberOfWindowsToBe(2));
	    //Switch to new window
	    for (String handle: driver.getWindowHandles())
	    {
	    	driver.switchTo().window(handle);
	    }
	    
	    System.out.println("New Page Title"+driver.getTitle());
	    System.out.println("New Page Message : "+ driver.findElement(By.cssSelector("h2.text-gray-800")).getText());
	   
	   
	    
	    

	}

}
