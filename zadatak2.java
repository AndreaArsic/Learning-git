package domaci_01_06_2021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. Zadatak
//		Napisti program koji:
//		Ucitava stranicu Zadatak2.html (skinite ovu stranicu kao na casu)
//		Dodaje 10 poruka na stranicu klikom na dugme
//		Potrebno je iskoristiti Explicit Wait za cekanje da dugme postane dostupno
//		Na kraju programa ispisati neku poruku za kraj
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/Dell/Desktop/Zadatak2.html");
		
		for (int i = 0; i <= 10; i++) {
		driver.findElement(By.id("showInBtn")).click();
		WebDriverWait waiter = new WebDriverWait (driver, 10, 500);
		WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id("id-"+i)));
		
		System.out.println(element.getText());
		
		}
		
		
		System.out.println("KRAJ!");
		
		
		
		
		
		
		
		
		
		

	}

}
