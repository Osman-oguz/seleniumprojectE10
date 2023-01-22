package com.cydeo.tests.Practice;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class google9Dot {


    @Test
    public void google9Dot(){
        Driver.getDriver().get("https://google.com");

        WebElement NineDot = Driver.getDriver().findElement(By.xpath("//a[@role='button']"));

        NineDot.click();


        WebElement haberler = Driver.getDriver().findElement(By.xpath("(//li[@class='j1ei8c'])[6]"));

        haberler.click();

        WebElement searchBox= Driver.getDriver().findElement(By.xpath("//input[@aria-label='Search for topics, locations & sources']"));
        searchBox.sendKeys("Turkey" + Keys.ENTER);



         WebElement firstNews = Driver.getDriver().findElement(By.xpath("//article[@class=' MQsxIb xTewfe R7GTQ keNKEd j7vNaf Cc0Z5d VkAdve GU7x0c JMJvke q4atFc']"));
         firstNews.click();



    }

}
