package com.cydeo.tests.Practice;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropTest extends TestBase {

    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement acceptCookies = driver.findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookies.click();

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(smallCircle,bigCircle).perform();

        Thread.sleep(3000);







    }
}
