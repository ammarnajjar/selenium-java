import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 */

/**
 * @author Ammar Najjar
 *
 */
public class TestStartPage {

	private WebDriver driver;
	private String url = "<PUT URL HERE>";
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Jenkins/tools/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test_StartPage_title_contains_webshop() {
		driver.get(url);
		String title = driver.getTitle();
		assertTrue(title.contains("webshop"));
	}

	@Test
	public void test_Karten_link_existiert() {
		driver.get(url);
		WebElement elem = driver.findElement(By.cssSelector("#mainNavigationBackground > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)"));
		assertNotNull(elem);
	}

	@Test
	public void test_Artikel_link_existiert() {
		driver.get(url);
		WebElement elem = driver.findElement(By.cssSelector("#mainNavigationBackground > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)"));
		assertNotNull(elem);
	}


	@Test
	public void test_Abonnements_link_existiert() {
		driver.get(url);
		WebElement elem = driver.findElement(By.cssSelector("#mainNavigationBackground > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1)"));
		assertNotNull(elem);
	}


	@Test
	public void test_Geschenkgutscheine_link_existiert() {
		driver.get(url);
		WebElement elem = driver.findElement(By.cssSelector("#mainNavigationBackground > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
		assertNotNull(elem);
	}


	@Test
	public void test_Mein_Konto_link_existiert() {
		driver.get(url);
		WebElement elem = driver.findElement(By.cssSelector("li.right:nth-child(4) > a:nth-child(1)"));
		assertNotNull(elem);
	}
}
