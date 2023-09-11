Feature: Navigate by Navbar

  Scenario: Go to Projects
    Given I’m on the Selenium documentation site
    When On the navbar - I click "Projects"
    Then I’m on the ‘Projects’ page

  Scenario: Go to Support
    Given I’m on the Selenium documentation site
    When On the navbar - I click "Support"
    Then I’m on the ‘Support’ page
