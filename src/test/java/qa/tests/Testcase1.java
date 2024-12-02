package qa.tests;

import PageEvents.*;
import Utils.ElementFetch;
import base.BaseTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase1 extends BaseTest {

    ElementFetch ele = new ElementFetch();
    LoginPageEvents loginPage = new LoginPageEvents();
    HomePageEvents homePage = new HomePageEvents();
    CartPageEvents cartPage = new CartPageEvents();
    CheckOutOverviewPageEvents overviewPage = new CheckOutOverviewPageEvents();
    CheckOutYourInfoPageEvents youInfoPage = new CheckOutYourInfoPageEvents();

    @Test(priority = 2)
    public void LoginFunctionality(){
        loginPage.login();
        logger.info("Signing in");

        homePage.verifyPageLoaded();
        logger.info("Login Successful");
    }

    @Test(priority = 3)
    public void checkNoOfItemsInCart(){
        loginPage.login();

        homePage.addBackpackToCart();
        homePage.addTShirtToCart();
        Assert.assertEquals(homePage.getCountInCart(), 2);
        logger.log(Status.INFO, "Step details here");
        logger.info("Assert conditions successful");
    }

    @Test(priority = 1)
    public void endToEndFlow(){
        loginPage.login();
        logger.info("Signing in");

        homePage.addBackpackToCart();
        homePage.addTShirtToCart();

        Assert.assertEquals(homePage.getCountInCart(), 2);
        logger.info("Assert Successful: Added 2 items to the Cart");

        homePage.clickCart();
        cartPage.clickOnCheckout();

        youInfoPage.enterReqDetails();
        overviewPage.finish();

        String actualMessage = ele.getWebElement("CLASSNAME", "complete-header").getText();
        System.out.println(actualMessage);

//        Assert.assertTrue(actualMessage.equals("Thank you for your order!"), "Wrong Message Found!!");
        Assert.assertEquals(actualMessage, "Thank you for your order!", "Wrong Message Found!!");
        logger.info("Assert Successful: Order Placed");
    }

    

}