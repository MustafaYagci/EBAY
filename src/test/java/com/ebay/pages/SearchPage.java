package com.ebay.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(xpath = "(//h3[@class='s-item__title'])[2]")
    public WebElement firstAnswer;
}
