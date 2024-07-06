package com.parallel.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParalellTest2 {

        WebDriver driver;

        @Test
        void loginTest() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:/Users/ACER/Downloads/Compressed/chromedriver-win64/chromedriver-win64/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/");
            driver.findElement(By.id("username")).sendKeys("Admin");
            driver.findElement(By.id("password")).sendKeys("Admin123");
            driver.findElement(By.id("btnlogin")).click();
            Assert.assertEquals(driver.getTitle(), "OrangeHRM");
        }

    @AfterMethod
    void testDown()
    {
        driver.quit();
    }
}
