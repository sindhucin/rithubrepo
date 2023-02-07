package Maven_Dummy.DummyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	@Test
	public void m1()
	{
		WebDriver driver;
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		String UN = System.getProperty("username");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(UN);
		//push
		//2nd push
	
	}
	}

