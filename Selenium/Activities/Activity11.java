package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page title is: " + driver.getTitle());
		
		WebElement checkbox=driver.findElement(By.id("checkbox"));
		WebElement togglebutton=driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
	    System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
		
		togglebutton.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
	    System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
		togglebutton.click();
		wait.until(ExpectedConditions.visibilityOf(checkbox));
	    System.out.println("Checkbox is visible? " + checkbox.isDisplayed());
		driver.quit();

	}

}
