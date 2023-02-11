package com.cydeo.utulities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType){
      WebDriver driver;

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver= new FirefoxDriver();
        }else {
            System.out.println("Given browser type does not exist/or is not currently supported");
            driver= null;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        return driver;
    }

}
