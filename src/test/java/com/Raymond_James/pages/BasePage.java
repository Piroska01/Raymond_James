package com.Raymond_James.pages;

import com.Raymond_James.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//ul[@class='fn-main-nav']//a[normalize-space()='Careers']")
    public WebElement CarriersTab;

    @FindBy(xpath = "//button[.='Accept']")
    public WebElement cookie;
}
