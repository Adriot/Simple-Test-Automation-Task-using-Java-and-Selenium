@Login
Feature: Login

  Scenario Outline: Verify that user cannot log in with valid but not registered email
    Given A user Go to "https://www.amazon.ae/"
    When  A user logs in with valid but not registered email "<username>" and "<password>"
    Then  Verify user can’t login

    Examples:
      | username | password |
      | username | password |