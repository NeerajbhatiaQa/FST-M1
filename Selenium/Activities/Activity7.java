package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.id("textInput")).isEnabled());
		driver.findElement(By.id("textInputButton")).click();
		System.out.println(driver.findElement(By.id("textInput")).isEnabled());
		driver.quit();

	}

}
