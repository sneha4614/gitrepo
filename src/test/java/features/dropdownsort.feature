
@RegressionTest
Feature: Dropdownsort

  Background: Navigate to saucedemo
    Given  the user navigates to "https://www.saucedemo.com"
    When the user logins with "standard_user" username and  "secret_sauce" password

    Scenario Outline: Verify login and dropdownsort feature
      And  the user should see 4 options in the sort dropdown
      When the user select "<option>" option from the dropdownsort list
      Then the user should see "<option>" option is selected in dropdownsort list
      Examples:
        | option |
        | Name (A to Z)  |
        | Name (Z to A)  |
        | Price (low to high) |
        | Price (high to low) |
