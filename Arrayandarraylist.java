package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arrayandarraylist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(10000);
		
		List<WebElement> itemname = driver.findElements(By.cssSelector("vm.selectedProduct.p_desc"));
		
				////*[@id="3ec82935-e7e9-4d1b-a1cd-c0282868e4bb"]/div[1]/div/div[2]/div/div/product-template-in-container/div[1]/div[4]/div[1]/a
		
		
		
		//button[@ng-click='vm.addToBasket(vm.selectedProduct);']
	}

}
