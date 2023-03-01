package com.website;

import LumaBase.LumaBasePage;
import com.motivitylabs.*;
import org.testng.annotations.Test;

//Here extending the Base class by using extends keyword we can call number of methods which are created by using pom/pagefactory or even normal webdriver also....
public class LaunchWebsite extends LumaBasePage {
 Loginpage Login;
 Homepage Home;

 AddToCart Add;

 AddressPage Address;
 PlaceOrder place;


@Test
public void Launchpage() throws InterruptedException {
 Login=new Loginpage(driver);
 Login.SetEmailId();
 Login.SetPassword();
Login.setLoginButton();

Home=new Homepage(driver);
Home.gears();


Add=new AddToCart(driver);
Add.wishlist();

Address=new AddressPage(driver);
Address.ClickingOperations();

place=new PlaceOrder(driver);
place.setPlaceOrder();
}
}
