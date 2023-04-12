package testBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTestBase {
	//initialize variable
	public static WebDriver driver;
	public static Properties prop;  //properties -help to read config prop file
	
	//create constructor
	public WebTestBase() 
	{
		//why try catch -while opening file if error is get
		try
		{
			//for read file config.propertes //user.dir-scope under the project//System.getProperty is path of project
			FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"//properties//config.properties");
			//create obj for prop
			prop=new Properties();
			prop.load(fileInputStream);// create object prop to read each element in file 
		}
		catch(Exception e)
		{
			e.printStackTrace();	//	
		}
		
	}
	
	//By creating properties obj able read the config properties
	public void  initialization() 
	{
		String browserName =prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			//to load the driver
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//driver//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments ("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
			//navigate-used for not wait for page load to move forward and backward
			driver.navigate().to(prop.getProperty("url"));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().deleteAllCookies();//delete all the cookies
		}
		
	}

}