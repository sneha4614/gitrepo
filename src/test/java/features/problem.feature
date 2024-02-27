Feature: Login functionality for problemuser with screenshot

  Background: Navigate to saucedemo
    Given  the user navigates to "https://www.saucedemo.com"
  @RegressionTest

    Scenario Outline: Verify login credentails of problemuser
    When the user login with "<username>" username and "<password>" password
      Then the user should see "<expectedtext>" text on page
      Examples:
      | username | password | expectedtext |
      |problem_user|secret_sauce | Products |
