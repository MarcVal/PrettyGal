Feature: Shopping for fashion products test case

  Scenario: As a visitor of the website I add products to cart and I proceed to checkout.

    Given I open "http://gabikis.wixsite.com/fashion"
    And I click on Sale text link
    And I click on first product listed
    And I click on quantity box
    And I select 5 pieces into quantity field
    And I click Add to cart button
    And I click on View Cart button
    And I wait for display
    And I decrease the product quantity
    Then I click on Checkout button




