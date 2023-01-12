package com.cydeo.tests.Practice;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task_Flipkart_com {


    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void flipkartTask(){
        // -  Go to https://www.flipkart.com/
        //- Locate Wire Headphones

        driver.get("https://www.flipkart.com/");

        Actions actions = new Actions(driver);



    }
}
