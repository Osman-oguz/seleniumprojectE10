package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

         //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //Locate home link using cssSelector
        WebElement homeLink_ex1= driver.findElement(By.cssSelector("a.nav-link"));

        WebElement homeLink_ex2= driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement homeLink_ex3= driver.findElement(By.cssSelector("a[href='/']"));


        //b. “Forgot password” header

        WebElement header_ex1= driver.findElement(By.cssSelector("div.example > h2"));

        //locate header using xpath, and using web elements text "Forgot Password"
        WebElement header_ex2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));


        //c. “E-mail” text

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //d. E-mail input box

        WebElement emailBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement emailBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'0-9')]"));

        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']

        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));


        //f. “Powered by Cydeo text

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        //4. Verify all web elements are displayed.

        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("emailBox_ex1.isDisplayed() = " + emailBox_ex1.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

    }
}
