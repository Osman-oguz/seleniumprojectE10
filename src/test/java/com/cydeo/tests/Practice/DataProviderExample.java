package com.cydeo.tests.Practice;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {


    @Test ( dataProvider = "searchData")
    public void dataProvider(String keyword, String expectedTitle){

        Driver.getDriver().get("https://www.google.com");
        WebElement search = Driver.getDriver().findElement(By.name("q"));


        search.sendKeys(keyword + Keys.ENTER);

        WebElement changeToEng = Driver.getDriver().findElement(By.xpath("//*[@id=\"Rzn5id\"]/div/a[2]"));
        changeToEng.click();


        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
        Driver.closeDriver();


    }

    @DataProvider( name = "searchData")
    public Object [][] testData(){

            return new Object[][]{
                    {"selenium", "selenium - Google Search"},
                    {"job", "job - Google Search"},
                    {"Cydeo", "Cydeo - Google Search"}
        };

    }
}
