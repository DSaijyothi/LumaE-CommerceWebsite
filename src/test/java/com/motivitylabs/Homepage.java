package com.motivitylabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
    WebDriver driver;
    public  Homepage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.driver=driver;
    }
    public void gears()
    {
        //performing actions classes to handle dropdowns and also mouse hovers actions are performed..
        Actions actions=new Actions(driver);
        WebElement parentElement=driver.findElement(By.xpath("//span[text()='Gear']"));

        actions.moveToElement(parentElement).perform();
        actions.moveToElement(driver.findElement(By.xpath("//span[text()='Bags']"))).click().perform();

    }

}
