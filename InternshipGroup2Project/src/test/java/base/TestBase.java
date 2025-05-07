package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	//
	protected WebDriver driver;
	protected Properties prop;
	public void loadprop() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\ANJITHA\\Desktop\\Project\\MavenGithub\\InternshipGroup2Project\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(fis);
	}
	@BeforeTest

	public void setConfig() throws IOException
	{//C:\Users\ANJITHA\git\Internship_Main_Project_Final2_Demo
	loadprop();
	driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}


}
