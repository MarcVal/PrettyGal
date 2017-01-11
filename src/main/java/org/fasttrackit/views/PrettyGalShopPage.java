package org.fasttrackit.views;

import org.eclipse.jetty.websocket.api.extensions.Frame;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 10/29/2016.
 */
public class PrettyGalShopPage {

    @FindBy(id = "i1ltay0q2label")
    private WebElement sale;

    public WebElement getSale() {
        return sale;
    }

    @FindBy(xpath = "//*[(@id = \"i41fkjx5iframe\")]")
    private WebElement publicFrame;

    public WebElement getPublicFrame() {
        return publicFrame;
    }

    @FindBy(className = "product-details-content-wrapper")
    private WebElement firstProduct;

    public WebElement getFirstProduct() {
        return firstProduct;
    }

    @FindBy(id = "i418uq0g_0iframe")
    private WebElement productFrame;

    public WebElement getProductFrame() {
        return productFrame;
    }

    @FindBy(className = "dropdown-quantity")
    private WebElement quantityBox;

    public WebElement getQuantityBox() {
        return quantityBox;
    }

    @FindBy(xpath = "//*[@id=\"ui-select-choices-row-0-4\"]/div")
    private WebElement quantityIncrease;

    public WebElement getQuantityIncrease() {
        return quantityIncrease;
    }

    @FindBy(xpath = "/html/body/product-page/div/section/div[2]/product-options/div/form/product-action/button")
    private WebElement addToCart;

    public WebElement getAddToCart() {
        return addToCart;
    }

    @FindBy(xpath = "//iframe[contains(@src,'cartwidgetPopup')]")
    private WebElement miniCartFrame;

    public WebElement getMiniCartFrame() {
        return miniCartFrame;
    }

    @FindBy(xpath = "//footer/a[contains(@class, 'button-primary')]")
    private WebElement viewCartButton;

    public WebElement getViewCartButton() {

        return viewCartButton;
    }

    @FindBy(className = "glyphicon-minus")
    private WebElement minusSignQuantity;

    public WebElement getMinusSignQuantity() {
        return minusSignQuantity;
    }

    @FindBy(id = "i418uq0miframe")
    private WebElement checkoutFrame;

    public WebElement getCheckoutFrame() {
        return checkoutFrame;
    }

    @FindBy(xpath = "//button[contains(@class, 'checkout-button')]")
    private WebElement checkoutButton;

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    @FindBy(xpath = "//*[@id=\"iv1gjupjframeWrap\"]")
    private WebElement onlinePaymentsFrame;

    public WebElement getOnlinePaymentsFrame() {
        return onlinePaymentsFrame;
    }

}
