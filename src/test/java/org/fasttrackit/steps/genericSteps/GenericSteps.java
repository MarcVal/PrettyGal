package org.fasttrackit.steps.genericSteps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.utils.TestUtils;
import org.fasttrackit.views.HomePage;
import org.fasttrackit.views.PrettyGalShopPage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GenericSteps extends TestBase {
    private HomePage closeWindow = PageFactory.initElements(driver, HomePage.class);
    private HomePage myAccountLink = PageFactory.initElements(driver, HomePage.class);
    private HomePage getMyAccountLink = PageFactory.initElements(driver, HomePage.class);
    private PrettyGalShopPage waitSeconds = PageFactory.initElements(driver, PrettyGalShopPage.class);
    private PrettyGalShopPage addToCart = PageFactory.initElements(driver,PrettyGalShopPage.class);


    @Given("^I open \"([^\"]*)\"$")
    public void openUrl(String url) {
        driver.get(url);
    }

    @And("^I wait (\\d+) second(?:s*)$")
    public void waitSeconds(int seconds) {
        TestUtils.sleep(seconds * 1000);
    }

    @Then("^I am redirected to \"([^\"]*)\"$")
    public void I_am_redirected_to(String redirectionUrl) {
        String currentUrl = driver.getCurrentUrl();
        assertThat("Redirection failed.", currentUrl, is(redirectionUrl));
    }

    @Given("^Go to \"([^\"]*)\"$")
    public void goTo(String link) {
        driver.get(link);
    }

    @And("^I close the subscribe invitation window$")
    public void iCloseTheWindow() {
        closeWindow.getCloseWindow().click();

    }

    @Then("^I move mouse over the My account menu$")
    public void iHoverTheMousePointerOverMyAccount() {
        mouseOver(myAccountLink.getMyAccountLink());
    }

    @And("^I wait for display$")
    public void iWaitForDisplay() {
       waitSeconds(5);
    }

}