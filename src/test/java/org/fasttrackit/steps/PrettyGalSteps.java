package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketFrame;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.PrettyGalShopPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by SatsangTurya on 10/29/2016.
 */
public class PrettyGalSteps extends TestBase {
    private PrettyGalShopPage prettyGalShopPage = PageFactory.initElements(driver, PrettyGalShopPage.class);


    @Then("^I click on Sale text link$")
    public void iClickOnSaleTextLink() {
        prettyGalShopPage.getSale().click();
    }

    @Then("^I click on first product listed$")
    public void iClickOnFirstProductListed() {
        driver.switchTo().frame(prettyGalShopPage.getPublicFrame());
        prettyGalShopPage.getFirstProduct().click();
        driver.switchTo().defaultContent();
    }

    @Then("^I click on quantity box$")
    public void iClickOnQuantityBox() {
        driver.switchTo().frame(prettyGalShopPage.getProductFrame());
        prettyGalShopPage.getQuantityBox().click();

    }

    @Then("^I select (\\d+) pieces into quantity field$")
    public void iSelectPiecesIntoQuantityField(int arg0) {
        prettyGalShopPage.getQuantityIncrease().click();

    }

    @And("^I click Add to cart button$")
    public void iClickAddToCartButton() {
        prettyGalShopPage.getAddToCart().click();
        driver.switchTo().defaultContent();

    }

    @Then("^I click on View Cart button$")
    public void iClickOnViewCartButton() throws InterruptedException {
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.switchTo().frame(prettyGalShopPage.getMiniCartFrame());
        Thread.sleep(1000);
        prettyGalShopPage.getViewCartButton().click();
        prettyGalShopPage.getViewCartButton().click();
        driver.switchTo().defaultContent();

    }


    @Then("^I decrease the product quantity$")
    public void iDecreaseTheProductQuantity() {

    }

    @And("^I click on Checkout button$")
    public void iClickOnCheckoutButton() {
        driver.switchTo().frame(prettyGalShopPage.getCheckoutFrame());
        prettyGalShopPage.getCheckoutButton().click();
        driver.switchTo().defaultContent();
    }

}
   // @Then("^I validate the checkout action$")
    //public void iValidateTheCheckoutAction() throws InterruptedException {
      //  driver.switchTo().defaultContent();
        //Thread.sleep(1000);
   //     driver.switchTo().frame(prettyGalShopPage.getOnlinePaymentsFrame());
     //   Thread.sleep(1000);
       // prettyGalShopPage.getOnlinePaymentsFrame().click();
        //prettyGalShopPage.getOnlinePaymentsFrame().click();
        //driver.switchTo().defaultContent();
    //}

