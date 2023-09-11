Feature: Navigate by Footer

  Scenario: Go to About Selenium
    Given I’m on the Selenium documentation site
    When On the footer - I click "AboutSelenium"
    Then I’m on the ‘About Selenium’ page


  Scenario: Go to Github
    Given I’m on the Selenium documentation site
    When On the footer - I click "Github"
    Then I’m on the ‘Github’ page

