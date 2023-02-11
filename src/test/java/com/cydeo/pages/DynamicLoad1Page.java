package com.cydeo.pages;

import com.cydeo.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad1Page {

    public DynamicLoad1Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement startButton;

    @FindBy(css = "div#loading")
    public WebElement loadingBar;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='pwd']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(css = ".flash")
    public WebElement errorMessage;
}
