package com.ebay.pages;

import com.ebay.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "(//*[@type='text'])")
    public WebElement searchBox;
    //assign once update once


    @FindBy(css = "[id='gdpr-banner-accept']")
    public WebElement cookies;

    @FindBy(xpath = "//ul[@class='hl-cat-nav__container']/li")
    public List<WebElement> modulesName;
}
