Feature: User Purchase

  Background: Navigate to saucedemo
    Given  the user navigates to "https://www.saucedemo.com"
    When the user logins with "standard_user" username and  "secret_sauce" password

  @SmokeTest4
  Scenario:  Add Sauce Labs Backpack to the cart
    When the user select the product "Sauce Labs Backpack" from the inventory
    And the user click on "Add to cart" button
    When the user select "Shopping Cart link" on the page
    And the user should see "Your Cart" text on the page