package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
		System.out.println("Page Title is :  "+driver.getTitle());
	
		driver.findElement(By.id("confirmation")).click();
		Alert confirmation=driver.switchTo().alert();
		
		System.out.println(confirmation.getText());
	    confirmation.accept();
	    
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("confirmation")).click();
	    Alert confirmation1=driver.switchTo().alert();
	    confirmation1.dismiss();
	    
	    System.out.println(driver.findElement(By.id("result")).getText());
	    
	}

}
