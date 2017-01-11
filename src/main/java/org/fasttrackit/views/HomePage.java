package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 10/28/2016.
 */
public class HomePage {

    @FindBy(className = "sumome-vex-close")
    private WebElement closeWindow;
    public WebElement getCloseWindow() {
        return closeWindow;
    }

    @FindBy (className = "my-account-link")
    private WebElement myAccountLink;
    public WebElement getMyAccountLink() {
        return myAccountLink;
    }

    @FindBy (className = "mini-my-account-create-account")
    private WebElement createAccount;
    public WebElement getcreateAccount () {
        return createAccount;
    }


}
