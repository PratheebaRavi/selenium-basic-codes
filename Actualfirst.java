package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actualfirst {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// STEP 1: give location of downloaded chrome driver
		// create an object for the class (chromeDriver)
		// launch website
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.com");
		Thread.sleep(10000);

		/*
		 * driver.findElement(By.xpath("//*[@id=\'tab-package-tab-hp\']")).click();
		 * Thread.sleep(10000); //checkboxes
		 * System.out.println(driver.findElements(By.xpath("//input[type='checkbox']")).
		 * size());
		 * System.out.println(driver.findElement(By.id("packages-flexible-checkbox")).
		 * isSelected());
		 * driver.findElement(By.id("packages-flexible-checkbox")).click();
		 * System.out.println(driver.findElement(By.
		 * className("check gcw-packages-partial-stay non-stop-and-refundable-check-boxes-in-high-contrast-mode"
		 * )).isSelected()); driver.findElement(By.
		 * className("check gcw-packages-partial-stay non-stop-and-refundable-check-boxes-in-high-contrast-mode"
		 * )).click(); System.out.println(driver.findElement(By.
		 * className("check gcw-packages-partial-stay non-stop-and-refundable-check-boxes-in-high-contrast-mode"
		 * )).isSelected());
		 */

//click a button
		driver.findElement(By.xpath("//*[@id=\'tab-flight-tab-hp\']")).click();
//type in a text box
		driver.findElement(By.cssSelector("#flight-origin-hp-flight")).sendKeys("chennai");
//auto suggestive drop downs
		WebElement destination = driver.findElement(By.xpath("//*[@id='flight-destination-hp-flight']"));
		Thread.sleep(1000);
		destination.sendKeys("Tor");
		Thread.sleep(1000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);

		/*
		 * //select method - only when <select> tag is present while inspecting
		 * WebElement adv =
		 * driver.findElement(By.id("flight-advanced-options-hp-flight")); adv.click();
		 * Select s = new
		 * Select(driver.findElement(By.id("flight-advanced-preferred-class-hp-flight"))
		 * ); s.selectByIndex(1); //System.out.println(s); Thread.sleep(5000);
		 * s.selectByValue("premium"); Thread.sleep(5000); //System.out.println(s);
		 * s.selectByVisibleText("Economy/Coach"); //System.out.println(s);
		 */
//dynamic drop downs - use indexes (chennai in from tab will also be present in to tab. So by default 1st one will be selected. might throw error
//parent child locators can also be used for dynamic drop drowns

//looping
		
		  driver.findElement(By.xpath(
		  "//*[@id='traveler-selector-hp-flight']/div/ul/li/button")).click();
		  driver.findElement(By.xpath("//*[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[1]/div[4]/button")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button/span[1]/svg"
		 * )).click(); driver.findElement(By.xpath(
		 * "//*[@id='traveler-selector-hp-flight']/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button/span[1]/svg"
		 * )).click();
		 */
		  
		/*
		 * Select s1 = new
		 * Select(driver.findElement(By.id("flight-age-select-1-hp-flight")));
		 * s1.selectByIndex(4); Select s2 = new
		 * Select(driver.findElement(By.id("flight-age-select-2-hp-flight")));
		 * s1.selectByValue("7"); driver.findElement(By.xpath(
		 * "//*[@id=\'traveler-selector-hp-flight\']/div/ul/li/div/footer/div/div[2]/button"
		 * ));
		 */
	}

}
