package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lab6Test {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    public Lab6Test() {
    }

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        this.js = (JavascriptExecutor)this.driver;
        this.vars = new HashMap();
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Test
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
}
