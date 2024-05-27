Feature: Calculator

  Scenario Outline: Addition
    Given I have entered <input1> into the calculator
    And I have entered <input2> into the calculator
    When I press add
    Then the result should be <result> on the screen

    Examples:
      | input1 | input2 | result |
      | 5      | 3      | 8      |
      | 7      | 2      | 9      |
