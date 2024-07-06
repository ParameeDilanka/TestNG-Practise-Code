package com.parallel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParalelTest1 {
    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ACER/Downloads/Compressed/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        WebElement logo=driver.findElement(By.xpath("/html/body/nav/div/a/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");

   Thread.sleep(5000);
    }



    @Test
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/ACER/Downloads/Compressed/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/");
        String title = driver.getTitle();
        Assert.assertEquals("Human Resources Management Software | OrangeHRM",title, "Logo is not matched");
        Thread.sleep(5000);
    }

    @AfterMethod
    void testDown()
    {
        driver.quit();
    }
}
