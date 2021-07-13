package selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.*;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

class ExampleSeleniumTest {

  static Process server;
  private WebDriver driver;

  @BeforeAll
  public static void setUpBeforeClass() throws Exception {
    ProcessBuilder pb = new ProcessBuilder("java", "-jar", "bookstore5.jar");
    server = pb.start();
  }

  @BeforeEach
  void setUp() {
    // Pick your browser
    // driver = new FirefoxDriver();
    // driver = new SafariDriver();
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://localhost:8080/");
    // wait to make sure Selenium is done loading the page
    WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
  }

  @AfterEach
  public void tearDown() {
    driver.close();
  }

  @AfterAll
  public static void tearDownAfterClass() throws Exception {
    server.destroy();
  }

  @Test
  void test1() {
    WebElement element = driver.findElement(By.id("title"));
    String expected = "YAMAZONE BookStore";
    String actual = element.getText();
    assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    WebElement welcome = driver.findElement(By.cssSelector("p"));
    String expected = "Welcome";
    String actual = welcome.getText();
    assertEquals(expected, getWords(actual)[0]);
    WebElement langSelector = driver.findElement(By.id("locales"));
    langSelector.click();
    WebElement frSelector = driver.findElement(By.cssSelector("option:nth-child(3)"));
    frSelector.click();
    welcome = driver.findElement(By.cssSelector("p"));
    expected = "Bienvenu";
    actual = welcome.getText();
    assertEquals(expected, getWords(actual)[0]);
  }

  @org.junit.Test
  public void Lab6Test() throws InterruptedException {
    this.driver.get("http://localhost:8080/login");
    this.driver.manage().window().setSize(new Dimension(1382, 744));
    this.driver.findElement(By.id("locales")).click();
    WebElement element = this.driver.findElement(By.id("locales"));
    element.findElement(By.xpath("//option[. = 'English']")).click();
    this.driver.findElement(By.id("locales")).click();
    this.driver.findElement(By.id("loginId")).click();
    this.driver.findElement(By.id("loginId")).sendKeys(new CharSequence[]{"generaluser"});
    this.driver.findElement(By.id("loginPasswd")).click();
    this.driver.findElement(By.id("loginPasswd")).sendKeys(new CharSequence[]{"mypassword"});
    this.driver.findElement(By.id("loginBtn")).click();
    this.driver.findElement(By.id("loginId")).click();
    this.driver.findElement(By.id("loginId")).sendKeys(new CharSequence[]{"admin"});
    this.driver.findElement(By.id("loginPasswd")).sendKeys(new CharSequence[]{"password"});
    this.driver.findElement(By.id("loginBtn")).click();
    this.driver.findElement(By.id("locales")).click();
    element = this.driver.findElement(By.id("locales"));
    element.findElement(By.xpath("//option[. = 'English']")).click();
    this.driver.get("http://localhost:8080/admin");
    this.driver.findElement(By.id("addBook-category")).click();
    this.driver.findElement(By.id("addBook-category")).sendKeys(new CharSequence[]{"Romance"});
    this.driver.findElement(By.id("addBook-id")).sendKeys(new CharSequence[]{"12345"});
    this.driver.findElement(By.id("addBook-title")).sendKeys(new CharSequence[]{"My Adventures"});
    this.driver.findElement(By.id("addBook-authors")).sendKeys(new CharSequence[]{"Hemingway"});
    this.driver.findElement(By.id("longDescription")).sendKeys(new CharSequence[]{"Hemingway's Adventures"});
    this.driver.findElement(By.id("cost")).click();
    this.driver.findElement(By.id("cost")).sendKeys(new CharSequence[]{"$10.00"});
    this.driver.findElement(By.name("addBook")).click();
    element = this.driver.findElement(By.name("addBook"));
    Actions builder = new Actions(this.driver);
    builder.moveToElement(element).perform();
    element = this.driver.findElement(By.tagName("body"));
    builder = new Actions(this.driver);
    builder.moveToElement(element, 0, 0).perform();
    this.driver.findElement(By.id("cost")).click();
    this.driver.findElement(By.id("cost")).sendKeys(new CharSequence[]{"10.00"});
    this.driver.findElement(By.name("addBook")).click();
    this.driver.findElement(By.id("search")).click();
    this.driver.findElement(By.id("search")).sendKeys(new CharSequence[]{"Romance"});
    this.driver.findElement(By.id("searchBtn")).click();
    String expectedURL = "http://localhost:8080/admin/catalog";
    String currentURL = this.driver.getCurrentUrl();
    Assert.assertEquals(expectedURL, currentURL);

    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(10000);


    WebElement elementy = driver.findElement(By.id("title-12345"));
    String expected = "My Adventures";
    String actual = elementy.getText();
    Assert.assertEquals(expected, actual);

  }

  private String[] getWords(String s) {
    return s.split("\\s+");
  }
}
