Feature: MainPage
  Start page should have Hello World, Volodya, Links

  Scenario: Is Hello World Displayed
    Given User navigate to Start Page
    When User search the client with word 3
    Then Results with mentioned Voldoya is shown