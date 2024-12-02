package PageEvents;

import PageObjects.CheckOutOverviewPageElemets;
import Utils.ElementFetch;

public class CheckOutOverviewPageEvents {
    ElementFetch ele = new ElementFetch();
    public void finish() {
        ele.getWebElement("ID", CheckOutOverviewPageElemets.finishID).click();
    }
}