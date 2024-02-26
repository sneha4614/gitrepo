Feature: Login functionality for standard_user

  Background: 1.Navigate to google
    Given the user navigates to "https://www.saucedemo.com/"

  @SmokeTest

        Scenario Outline: 1 verify login credentials with datadriven

          When the user enters "<userName>" username and "<passWord>" password

         Then the user should see "<expectedText>" text on the page

          Examples:
          |userName   |passWord      |expectedText|
          |standard_user|secret_sauce   |Products    |
          |standard_user|secret1_sauce |Epic sadface: Username and password do not match any user in this service|
          |standard_user|blank         |Epic sadface: Username and password do not match any user in this service|


Scenario: Verify login credentials

  And the user enters "locked_out_user" in username field
  And the user enters "secret_sauce" in password field
  And the user clicks  login button
  Then the user should see "Epic sadface: Sorry, this user has been locked out" text on the page

  @SmokeTest2

  Scenario Outline: Verifying login credentials using data driven

    When the user enters "<userName>" username and "<passWord>" password
    And the user clicks login button
    Then the user should see "<expectedText>" text on the page
Examples:
    | userName    | passWord     |  expectedText|
    |locked_out_user|secret_sauce|Epic sadface :username and password do not match in this service|
    |locked_out_user|secret_sauce1|Epic sadface :username and password do not match in this service|
    |locked_out_user1|secret_sauce|Epic sadface :username and password do not match in this service|






