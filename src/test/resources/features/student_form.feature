Feature: Student Registration Form

  Scenario: Fill student form successfully
    Given user opens the registration page
    When user enters all required details
    And user submits the form
    Then form should be submitted successfully