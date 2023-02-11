package com.cydeo.tests.Practice;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InterviewQ1 {

    @Test
    public void test() throws InterruptedException {

        // Go to the website
        Driver.getDriver().get("http://www.amazon.com.tr");

        // accept cookies
        WebElement acceptCookies = Driver.getDriver().findElement(By.id("sp-cc-accept"));
        acceptCookies.click();


        // go to search box and serach iPhone 13 512
        WebElement searchDropdownBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchDropdownBox.sendKeys("iPhone13 512"+ Keys.ENTER);

        // select iPhone 13 at the top
        WebElement iPhone13 = Driver.getDriver().findElement(By.linkText("Apple iPhone 13 (512 GB) - Gece Yarısı"));
        iPhone13.click();
        Thread.sleep(2000);

        // web element for the price
        WebElement priceWholeNumber = Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        WebElement priceDecimalNumber = Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-fraction'])[1]"));
        WebElement priceSymbol = Driver.getDriver().findElement(By.xpath("(//span[@class='a-price-symbol'])[1]"));

        // web element for the brand
        String text = Driver.getDriver().findElement(By.xpath("//*[@id=\"title\"]")).getText();
        String iPhoneText = text.substring(6, 15);

        // web element for the size
        WebElement size = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[1]"));
        String sizeText = size.getText();

        System.out.println(iPhoneText+ " Size:" + sizeText);

        //web element for the color
        WebElement yildizIsigi= Driver.getDriver().findElement(By.xpath("//button[@id='a-autoid-19-announce']"));
        yildizIsigi.click();




        WebElement color = Driver.getDriver().findElement(By.xpath("(//span[@class='selection'])[2]"));
        String colorText = color.getText();

        // text for the price
        String priceWholeNumberText = priceWholeNumber.getText();
        String priceDecimalNumberText = priceDecimalNumber.getText();
        String priceSymbolText = priceSymbol.getText();



        // for the print(assertion) we can do this part with assert
        System.out.println("Color:"+ colorText + " Price:" + priceWholeNumberText + ","+ priceDecimalNumberText + priceSymbolText);


        // for the stock
        WebElement stock = Driver.getDriver().findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));
        Assert.assertTrue(stock.getText().contains("Stokta var"));
        System.out.println("Stock:" +stock.getText());


    }
}
