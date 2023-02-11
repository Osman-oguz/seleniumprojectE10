package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utulities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMPractices {

    LibraryLoginPage libraryLoginPage;
    Faker faker;

    @BeforeMethod
    public void setup(){
        //2- Go to https://library1.cydeo.com/
        Driver.getDriver().get("https://library1.cydeo.com/");
        libraryLoginPage = new LibraryLoginPage();
    }
    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void required_field_error_message_test() {

        //Tc #1: required field error message test
        //1- Open a Chrome browser

        //3- Do not enter any information
        //4- Click to "Sign in" button

        libraryLoginPage.signInButton.click();

        //5-Verify expected error is displayed:
        //Expected: This field is required.

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

    }

    @Test
    public void invalid_email_format_error_message_test() {
        //TC #2: Invalid email format error message test
        //1- Open a chrome browser
        //2- Go to: "https://library1.cydeo.com"


        //3- Enter invalid email format

        faker = new Faker();

        libraryLoginPage.inputUsername.sendKeys(faker.bothify("#######?????"));

        libraryLoginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        String expected = "Please enter a valid email address.";
        Assert.assertEquals(libraryLoginPage.enterValidEmailErrorMessage.getText(), expected);


    }

    @Test
    public void library_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com


        //3- Enter incorrect username or incorrect password

        faker = new Faker();

        libraryLoginPage.inputUsername.sendKeys(faker.bothify("#######@gmail.com"));

        libraryLoginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password

        String expected= "Sorry, Wrong Email or Password";

        Assert.assertEquals(libraryLoginPage.wrongEmailOrPasswordErrorMessage.getText(),expected);



    }



}
