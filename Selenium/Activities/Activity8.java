package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/mouse-events");
		Actions action=new Actions(driver);
		
		System.out.println("Page title: " + driver.getTitle());
 
        WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
        WebElement cargoToml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
        WebElement srcButton = driver.findElement(By.xpath("//h1[text()='src']"));
        WebElement targetButton = driver.findElement(By.xpath("//h1[text()='target']"));

        action.click(cargoLock).moveToElement(cargoToml).click(cargoToml).build().perform();
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        
        action.doubleClick(srcButton).contextClick(targetButton).build().perform();
        action.click(driver.findElement(By.xpath("//button/span"))).pause(3000).build().perform();
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
        driver.quit();

	}

}
