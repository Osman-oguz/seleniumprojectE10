package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utulities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser

        driver = WebDriverFactory.getDriver("chrome");
        // maximize the page
        driver.manage().window().maximize();
        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropDownTest(){

        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropDown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        WebElement currentlySelectedOption = simpleDropDown.getFirstSelectedOption();

        String actualSimpleDropdownText= currentlySelectedOption.getText();
        String expectedSimpleDropdownText= "Please select an option";

        //Expected: “Please select an option”
        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);


        //4. Verify “State selection” default selected value is correct
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedStateDropdownText ="Select a State";
        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);


        //Expected: “Select a State”

    }
}
