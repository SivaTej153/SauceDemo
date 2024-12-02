package PageEvents;

import PageObjects.LoginPageOjects;
import Utils.ElementFetch;
import base.BaseTest;

public class LoginPageEvents extends BaseTest{
    ElementFetch ele = new ElementFetch();
    public void login() {
        ele.getWebElement("ID", LoginPageOjects.userNameTextBoxID).sendKeys("standard_user");
        ele.getWebElement("ID", LoginPageOjects.passwordTextBoxID).sendKeys("secret_sauce");
        ele.getWebElement("ID", LoginPageOjects.loginButtonID).click();
    }
}
