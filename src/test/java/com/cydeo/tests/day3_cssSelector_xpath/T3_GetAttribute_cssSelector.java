package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_GetAttribute_cssSelector {

    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        WebElement logInButton= driver.findElement(By.className("login-btn"));
       // WebElement logInButton= driver.findElement(By.cssSelector("input.login-btn"));

        String expectedLogInButtonText = "Log In";
        String actualLogInButtonText = logInButton.getAttribute("value");

        System.out.println("actualLogInButtonText = " + actualLogInButtonText);


        if (actualLogInButtonText.equals(expectedLogInButtonText)){
            System.out.println("Log in button text verification PASSED!");
        }else {
            System.out.println("Log in button text verification FAILED!!!");
        }

    }
}
