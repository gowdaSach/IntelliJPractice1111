Feature: Login to DemoGuru99 Page

  Scenario Outline: User login to DemoGuru99 page with valid credentials
    Given User launches chrome browser
    And User search for the URL "https://demo.guru99.com/test/login.html"
    When User provides <username> and <password>
    And User clicks on submit button
    Then User validates the home page title as " "


    Examples:
      | username         | password       |
      | mngr484448       |   UhYvUnU      |

