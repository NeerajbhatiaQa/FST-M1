package activities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/drag-drop");
		
		Actions builder=new Actions(driver);
		WebElement Dropzone1=driver.findElement(By.id("dropzone1"));
		WebElement Dropzone2=driver.findElement(By.id("dropzone2"));
		WebElement ball=driver.findElement(By.id("ball"));
		
	    builder.dragAndDrop(ball,Dropzone1).build().perform();
	    Assert.assertEquals(driver.findElement(By.cssSelector(".dropzone-text")).getText(),"Dropped!");
	    
	    builder.dragAndDrop(ball,Dropzone2).build().perform();
	    Assert.assertEquals(driver.findElement(By.cssSelector(".dropzone-text")).getText(),"Dropped!");

	}

}
