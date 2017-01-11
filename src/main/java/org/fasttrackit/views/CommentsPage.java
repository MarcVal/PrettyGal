package org.fasttrackit.views;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 10/29/2016.
 */
public class CommentsPage {


    @FindBy (id = "i1ltay0q3label")
    private WebElement commentsMenuLink;
    public WebElement getCommentsMenuLink() { return commentsMenuLink; }

    @FindBy (css = "#comp-ijwqceljiframe")
    private WebElement commentFrame;
    public WebElement getCommentFrame() {
        return commentFrame;
    }

    @FindBy (name = "$ctrl.commentForm")
    private WebElement commentsFieldBox;
    public WebElement getCommentsFieldBox() { return commentsFieldBox; }

    @FindBy (css = "div.wxa-form-group")
    private WebElement nameField;
    public WebElement getNameField() { return nameField; }

    @FindBy  (name = "email")
    private WebElement emailField;
    public WebElement getEmailField() { return emailField; }

    @FindBy (css = "button.btn.btn-primary")
    private WebElement submitCommentButton;
    public WebElement getSubmitCommentButton() { return submitCommentButton; }

    @FindBy (xpath = "/html/body/div/div/comments-widget/div/ul/li[1]/div[2]")
    private WebElement validationCommentSubmission;
    public WebElement getValidationCommentSubmission() {
        return validationCommentSubmission;
    }

    public void type(){
        commentsFieldBox.sendKeys("asdf fgbvrcfed");
    }
}







