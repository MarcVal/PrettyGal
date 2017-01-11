package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.eclipse.jetty.util.annotation.Name;
import org.fasttrackit.steps.genericSteps.TestBase;
import org.fasttrackit.views.CommentsPage;
import org.fasttrackit.views.ResultsPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;
import sun.plugin2.message.Message;

/**
 * Created by SatsangTurya on 10/29/2016.
 */
public class CommentSteps extends TestBase {

    private CommentsPage commentsPage = PageFactory.initElements(driver, CommentsPage.class);


    @And("^I click on Comments link text$")
    public void iClickOnCommentsLinkText() {
        commentsPage.getCommentsMenuLink().click();
    }

    @And("^I click on Comments box$")
    public void iClickOnCommentsBox() {
        driver.switchTo().frame(commentsPage.getCommentFrame());
        commentsPage.getCommentsFieldBox().click();
    }

    @Then("^I type \"(.+?)\" in the comments box$")
    public void iTypeInTheCommentsBox (String text)  {
   focusAndSendKeys(text,commentsPage.getCommentsFieldBox());
    }

    @And("^I type \"([^\"]*)\" in the name field$")
    public void iTypeInTheNameField(String name) {
      focusAndSendKeys(name,commentsPage.getNameField());
    }


    @Then("^I press the submit comment button$")
    public void iPressTheSubmitCommentButton() {
        commentsPage.getSubmitCommentButton().click();

            }

    @Then("^I validate comment submission$")
    public void iValidateCommentSubmission()  {
        commentsPage.getValidationCommentSubmission().isDisplayed();
        driver.switchTo().defaultContent();
    }


    @And("^I type \"([^\"]*)\" in the email field in the comments page$")
    public void iTypeInTheEmailFieldInTheCommentsPage(String email)  {
        focusAndSendKeys(email, commentsPage.getEmailField());
    }
}
