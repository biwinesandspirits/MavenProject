package MavenTests.AttemptTest;





import static org.junit.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;




public class SimpleTestSuite {

	

	
	
	
	
	@After
	public void after()
	{
		System.out.println("This is after Annotation");
	}

	
	@Test
	public void display()
	{
		System.out.println("This is Display Method");

		ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
		driver.get("https://uat.bordeauxindex.com/fine-wine/red-bordeaux/margaux/palmer-2016");
	    System.out.println(driver.getTitle());
		assertEquals(driver.getTitle(), "2016 Palmer");
		driver.close();

	}
	
	
	@Test
	public void test2()
	{
		System.out.println("This is test 2");

	}
	
	
	@Test
	public void test3()
	{
		System.out.println("This is test 3");
		System.out.println("This is Display Method");
//		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.google.com");
	//	System.out.println(driver.getTitle());
		//assertEquals(driver.getTitle(), "Google");
		//driver.close();

	}
	
	
	@Before
	public void testing()
	{
		System.out.println("This is before Annotation");
	}

}