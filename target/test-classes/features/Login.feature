Feature: Login Automation Exercise Website

  Scenario: Successful login with valid credentials
    Given user launch chrome browser
    When User on automation exercise page "homepage"
    And User enter valid email as "patilbhagyashri011@gmail.com" and password as "Sw@mi2296"
    And click on login
    Then Page Title Should be "Automation Exercise"
    When User click on logout link
    And close browser
