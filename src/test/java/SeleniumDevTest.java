import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;


public class SeleniumDevTest {

    private WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void seleniumDevSiteShouldBeOpen() {
        driver.get("https://www.selenium.dev/");
        String title = driver.getTitle();
        System.out.println(title); //SeleniumHQ Browser Automation

        assertThat(title).isEqualTo("SeleniumHQ Browser Automation");
    }

    @Test
    public void seleniumDownloadsShouldBeOpen() {
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/downloads/");
        navigate.back();
        navigate.forward();
        navigate.refresh();

        assertThat(driver.getTitle()).isEqualTo("Downloads");
    }

    @Test
    public void seleniumDocumentationShouldBeOpen() {
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/documentation/en/");
        navigate.back();
        navigate.forward();
        navigate.refresh();

        assertThat(driver.getTitle()).isEqualTo("The Selenium Browser Automation Project :: Documentation for Selenium");
    }

    @Test
    public void seleniumSupportShouldBeOpen() {
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/support/");
        navigate.back();
        navigate.forward();
        navigate.refresh();

        assertThat(driver.getTitle()).isEqualTo("Selenium Support");
    }

    @Test
    public void seleniumBlogShouldBeOpen() {
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/blog/");
        navigate.back();
        navigate.forward();
        navigate.refresh();

        assertThat(driver.getTitle()).isEqualTo("Selenium Blog");
    }

    @Test
    public void seleniumProjectsShouldBeOpen() {
        WebDriver.Navigation navigate = driver.navigate();
        navigate.to("https://www.selenium.dev/projects/");
        navigate.back();
        navigate.forward();
        navigate.refresh();

        assertThat(driver.getTitle()).isEqualTo("Selenium Projects");
    }

}