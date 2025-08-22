package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver=new FirefoxDriver();
				driver.get("https://training-support.net/webelements/alerts");
				System.out.println("Page Title is :  "+driver.getTitle());
			
				driver.findElement(By.id("prompt")).click();
				Alert prompt=driver.switchTo().alert();
				System.out.println(prompt.getText());
				prompt.sendKeys("Awesome!");
				Thread.sleep(1000);
				prompt.accept();
				
				System.out.println(driver.findElement(By.id("result")).getText());
				

	}

}
