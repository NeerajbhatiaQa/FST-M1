package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/selects");
		System.out.println(driver.getTitle());
		
		WebElement select1=driver.findElement(By.cssSelector("select.h-80"));
		Select dropdown=new Select(select1);
	
		//Select the "HTML" option using the visible text.
		dropdown.selectByVisibleText("HTML");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//Select the 4th, 5th and 6th options using the index.
		dropdown.selectByIndex(3);
		dropdown.selectByIndex(4);
		dropdown.selectByIndex(5);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//Select the "Node" option using the value.
		dropdown.selectByValue("nodejs");
		
		List<WebElement> selectedOptions=dropdown.getAllSelectedOptions();
		for(WebElement options : selectedOptions)
		{
			System.out.println(options.getText());
		}
	}

}
