package com.cydeo.tests.day7_webtables_utulities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utulities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {


         //TC #3: Login scenario
    @Test
    public void crm_login_test(){

        //2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys("helpdesk1@cybertekschool.com");

        //helpdesk1@cybertekschool.com UserUser
        //helpdesk2@cybertekschool.com UserUser

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        //Expected: Portal

        BrowserUtils.verifyTitle(driver,"Portal");
    }
}
