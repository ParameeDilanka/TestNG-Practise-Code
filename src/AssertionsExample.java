import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AssertionsExample {

    WebDriver driver;
    @BeforeClass
    void setUp(){
        System.setProperty("webdriver.chrome.driver","D:/Needed Libraries and Others/TestNG/chromedriver-win64/chromedriver-win64/chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("https://www.orangehrm.com/");
    }

@Test
    void logoTest(){
        WebElement logo=driver.findElement(By.xpath("/html/body/nav/div/a/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
    //Assert.assertFalse(logo.isDisplayed(), "Logo is displayed on the page");

}

    @Test
    void homePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Human Resources Management Software | OrangeHRM",title, "Logo is not matched");
    }

    @AfterClass
    void testDown()
    {
       driver.quit();
    }
}
