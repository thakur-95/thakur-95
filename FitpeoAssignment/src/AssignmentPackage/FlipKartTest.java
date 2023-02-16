package AssignmentPackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Server_Standalone\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
	    //1. open www. flipkart.com

	    driver.get("https://www.flipkart.com/");
	    
	    driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2doB4z\']")).click();
		driver.manage().window().maximize();
		
		//2. type ipad in the search box
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iPad");
		
		//3. when the suggestions are displayed, click one of them

		driver.findElement(By.xpath("//button[@class=\'L0Z3Pu\']")).click();    
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//Not able to find Online Only filter type.
		
		//5. select one of the results
		driver.findElement(By.xpath("//div[contains(text(),'4 GB ROM 10.2 inch with Wi-Fi Only (Space Grey)')]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		//6. Checkout the order
		ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
	    //switch to new tab
	    driver.switchTo().window(tab.get(1));
	    
	    //7. Place the order
	    driver.findElement(By.xpath("//button[@class=\'_2KpZ6l _2U9uOA ihZ75k _3AWRsL\']")).click();
		
	    
	    //8. Enter Random Email and Phone number
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")).sendKeys("1234567890");
	    
	}
	
}
