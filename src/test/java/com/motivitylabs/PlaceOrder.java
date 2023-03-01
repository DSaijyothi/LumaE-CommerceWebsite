package com.motivitylabs;

import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class PlaceOrder {
    WebDriver driver;

    public PlaceOrder(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;

    }
//Using pagefactory with xpath locator perform clickoperation on placeorder
    @FindBy(xpath = "//button[@class='action primary checkout'and @type='submit']")
    WebElement PlaceOrder;

    public void setPlaceOrder() {
        PlaceOrder.click();
//Applied Script timeout to visible the desired content
       driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }


}

