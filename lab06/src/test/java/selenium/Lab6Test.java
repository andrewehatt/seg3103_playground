package selenium;// Generated by Selenium IDE
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Lab6Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void delete() {
    driver.get("http://localhost:8080/login");
    driver.manage().window().setSize(new Dimension(1382, 744));
    driver.findElement(By.id("locales")).click();
    {
      WebElement dropdown = driver.findElement(By.id("locales"));
      dropdown.findElement(By.xpath("//option[. = 'English']")).click();
    }
    driver.findElement(By.id("locales")).click();
    driver.findElement(By.id("loginId")).click();
    driver.findElement(By.id("loginId")).sendKeys("generaluser");
    driver.findElement(By.id("loginPasswd")).click();
    driver.findElement(By.id("loginPasswd")).sendKeys("mypassword");
    driver.findElement(By.id("loginBtn")).click();
    //driver.close();
    driver.findElement(By.id("loginId")).click();
    driver.findElement(By.id("loginId")).sendKeys("admin");
    driver.findElement(By.id("loginPasswd")).sendKeys("password");
    driver.findElement(By.id("loginBtn")).click();
    driver.findElement(By.id("locales")).click();
    {
      WebElement dropdown = driver.findElement(By.id("locales"));
      dropdown.findElement(By.xpath("//option[. = 'English']")).click();
    }
    //driver.findElement(By.id("locales")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("http://localhost:8080/admin");
    driver.findElement(By.id("addBook-category")).click();
    driver.findElement(By.id("addBook-category")).sendKeys("Romance");
    driver.findElement(By.id("addBook-id")).sendKeys("12345");
    driver.findElement(By.id("addBook-title")).sendKeys("My Adventures");
    driver.findElement(By.id("addBook-authors")).sendKeys("Hemingway");
    driver.findElement(By.id("longDescription")).sendKeys("Hemingway\'s Adventures");
    driver.findElement(By.id("cost")).click();
    driver.findElement(By.id("cost")).sendKeys("$10.00");
    driver.findElement(By.name("addBook")).click();
    {
      WebElement element = driver.findElement(By.name("addBook"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("cost")).click();
    driver.findElement(By.id("cost")).sendKeys("10.00");
    driver.findElement(By.name("addBook")).click();
    driver.findElement(By.id("search")).click();
    driver.findElement(By.id("search")).sendKeys("Romance");
    driver.findElement(By.id("searchBtn")).click();

    String expectedURL = "http://localhost:8080/admin/catalog";
    String currentURL = driver.getCurrentUrl();
    assertEquals(expectedURL, currentURL);
  }
}
