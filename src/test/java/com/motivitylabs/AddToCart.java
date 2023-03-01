package com.motivitylabs;

import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AddToCart {
    WebDriver driver;

    public AddToCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void wishlist() throws InterruptedException {
        driver.findElement(By.cssSelector("#maincontent > div.columns > div.column.main > div.products.wrapper.grid.products-grid > ol > li:nth-child(8) > div > a > span > span > img")).click();


        WebElement element = driver.findElement(By.cssSelector("[title='Add to Cart']"));
        element.click();


        //clicking on AddCart with Actions class
        Actions act = new Actions(driver);

        WebElement parentElement = driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/checkout/cart/']"));
        act.moveToElement(parentElement).click().perform();

        act.moveToElement(driver.findElement(By.cssSelector("#top-cart-btn-checkout"))).click().perform();
       // driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        Thread.sleep(50000);

       }

    }


