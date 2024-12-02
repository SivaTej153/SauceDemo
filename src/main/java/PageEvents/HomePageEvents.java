package PageEvents;

import PageObjects.HomePageObjects;
import Utils.ElementFetch;
import org.testng.Assert;

public class HomePageEvents {

    ElementFetch ele = new ElementFetch();

    public void verifyPageLoaded() {
        Assert.assertTrue(!ele.getWebElements("CLASSNAME", HomePageObjects.secondaryContainer).isEmpty(), "element not found");
    }

    public void addBackpackToCart() {
        ele.getWebElement("ID", HomePageObjects.backpackCartID).click();
    }
    public void addBikeLightToCart() {
        ele.getWebElement("ID", HomePageObjects.bikeLightCartID).click();
    }
    public void addTShirtToCart() {
        ele.getWebElement("ID", HomePageObjects.tShirtCartID).click();
    }
    public void addJacketToCart() {
        ele.getWebElement("ID", HomePageObjects.jacketCartID).click();
    }
    public void addOnsieToCart() {
        ele.getWebElement("ID", HomePageObjects.onesieCartID).click();
    }
    public void addRedTShirtToCart() {
        ele.getWebElement("ID", HomePageObjects.redTShirtCartID).click();
    }

    public void clickCart() {
        ele.getWebElement("CLASSNAME", HomePageObjects.cartButtonClass).click();
    }

    public int getCountInCart(){
        String response = ele.getWebElement("CLASSNAME", HomePageObjects.cartItemCountBadgeClass).getText();
        return Integer.parseInt(response);
    }
}
