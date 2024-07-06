import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setUp(String browser, String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:/Users/ACER/Downloads/Compressed/chromedriver-win64/chromedriver-win64/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:/Users/ACER/Downloads/Compressed/geckodriver-v0.33.0-win64/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get(app);
    }

    @Test(priority = 1)
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("/html/body/nav/div/a/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
        //Assert.assertFalse(logo.isDisplayed(), "Logo is displayed on the page");

    }

    @Test(priority = 2)
    void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals("Human Resources Management Software | OrangeHRM", title, "Logo is not matched");
        // Assert.assertEquals("Human Resources Management Software | OrangeHRM123",title, "Logo is not matched");

    }

    @AfterClass
    void testDown() {
        driver.quit();
    }
}
