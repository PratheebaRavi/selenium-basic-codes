package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	//STEP 1: give path of downloaded driver
		//create an object for the class (chrome, firefox etc)
		//launch url
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravic\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.expedia.com");

//calling another class to this

		/*
		 * Login ls = new Login(); ls.userlogin();
		 */
driver.findElement(By.id("header-account-menu")).click();	
driver.findElement(By.id("account-register")).click();
driver.findElement(By.id("gss-signup-first-name")).sendKeys("trial");
driver.findElement(By.id("gss-signup-last-name")).sendKeys("account");
driver.findElement(By.id("gss-signup-email")).sendKeys("krishna_600032@yahoo.com");
driver.findElement(By.id("gss-signup-password")).sendKeys("Trialaccount1@");
driver.findElement(By.id("gss-signup-submit")).click();	
Thread.sleep(50000);
driver.findElement(By.id("gss-signup-submit")).click();	
	}

}
