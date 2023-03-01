package com.motivitylabs;

import org.openqa.selenium.*;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Clock;
import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;


public class AddressPage {
    WebDriver driver;

    public AddressPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath="//input[@name='ko_unique_1'and@class='radio']")
    WebElement price;

    @FindBy(xpath="//button[@type='submit' and@class='button action continue primary' ]")
    WebElement NextButton;
    public void ClickingOperations() throws InterruptedException {
        // Applied fluent wait because the we need to know the button is clickable @certain period of time
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMinutes(1))
                .ignoring(Exception.class);
        price.click();
        Wait waits = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofMinutes(1))
                .ignoring(Exception.class);
        NextButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }
}