package PageEvents;

import PageObjects.CheckOutYourInfoPageElements;
import PageObjects.LoginPageOjects;
import Utils.ElementFetch;

public class CheckOutYourInfoPageEvents {

    ElementFetch ele = new ElementFetch();
    public void enterReqDetails() {
        ele.getWebElement("ID", CheckOutYourInfoPageElements.firstNameID).sendKeys("Siva Tej");
        ele.getWebElement("ID", CheckOutYourInfoPageElements.lastNameID).sendKeys("secret_sauce");
        ele.getWebElement("ID", CheckOutYourInfoPageElements.zipCodeID).sendKeys("14221");
        ele.getWebElement("ID", CheckOutYourInfoPageElements.continueID).click();
    }
}
