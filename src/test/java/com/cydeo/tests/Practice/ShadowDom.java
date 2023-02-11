package com.cydeo.tests.Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ShadowDom {

    WebDriver driver;

    @Test
    public void testShadowDom() throws InterruptedException {

        driver.get("https://letcode.in/shadow");
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Shadow Root - Closed
        String str1 = "document.querySelector(\"my-web-component\").myRoot.querySelector(\"#email\").value=\"Smith\"";
        js.executeScript(str1);




    }
}
