package PageEvents;

import PageObjects.CartPageElements;
import Utils.ElementFetch;

public class CartPageEvents {

    ElementFetch ele = new ElementFetch();

    public void clickOnCheckout() {
        ele.getWebElement("ID", CartPageElements.checkOutID).click();
    }
}
