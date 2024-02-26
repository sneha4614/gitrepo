Feature: Purchaseproduct

  Background: Navigate to saucedemo
    Given  the user navigates to "https://www.saucedemo.com"
    When the user logins with "standard_user" username and  "secret_sauce" password
@SmokeTest
  Scenario Outline: Add Product
    When the user select the product "Sauce Labs Backpack" from the inventory
    And the user click on "Add to cart" button
  And the user select "Shopping Cart link" on the page
    Then the user proceeds to the checkout

    When the user enters "<FirstName>" first name, "<LastName>" last name and "<Zip/Postal code>" postcode
    And the user click on the "Finish" button
    Then the user should see "<Expected Text>" text on the page

    Examples:
      | FirstName | LastName | Zip/Postal code | Expected Text |
      | SS       | SID     | MK11            | Thank you for your order! |