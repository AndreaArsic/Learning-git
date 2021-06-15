package domaci_01_06_2021;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.Zadatak
//		Napisati program koji ucitava stranicu Zadatak1.html
//		I ceka dok se na stranici ne pojave bar 20 poruka (20 div-a)
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/Zadatak1.html");
		
		for (int i = 0; i < 21; i++) {
		driver.findElement(By.id("showInBtn")).click();
		WebDriverWait waiter = new WebDriverWait (driver, 100, 1000);
		WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id("id-" + i)));
		
		System.out.println(element.getText());
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
