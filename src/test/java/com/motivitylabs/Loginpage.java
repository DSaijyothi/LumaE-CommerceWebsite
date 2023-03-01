package com.motivitylabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Loginpage {
    WebDriver driver;

    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "[id='email']")
    WebElement EmailId;

    @FindBy(name = "login[password]")
    WebElement password;

    @FindBy(xpath = "//span[text()='Sign In']//parent::button[@class='action login primary']")
    WebElement LoginButton;


    public void SetEmailId() {

        EmailId.sendKeys("saijyothid12@gmail.com");
    }
    public void SetPassword() throws InterruptedException {
        password.sendKeys("Saijyothi@123");

        //Applied WebDriver wait to check the valid mail&password
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void setLoginButton() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        LoginButton.click();

    }
}
