Feature: Leaving comments to commerce websites

  Scenario: I am leaving a comment in a commercial website

    Given I open "http://gabikis.wixsite.com/fashion"
    And I click on Comments link text
    Then I wait 9000 seconds
    And I click on Comments box
    Then I type "Hello, this is a test 101" in the comments box
    And I type "John" in the name field
    And I type "email@address.com" in the email field in the comments page
    Then I press the submit comment button
    And I wait for display
    Then I validate comment submission
