package vidya.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uipage {

	public  void Testing() {
		System.setProperty("webdriver.chrome.driver",
		           "C:\\Users\\lvreddy\\Desktop\\selenium\\chromedriver.exe");
		
	
		 WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement element =driver.findElement(By.name("q"));
		//Thread.sleep(5000);
		element.sendKeys("Orange");
		element.submit();
		//Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
