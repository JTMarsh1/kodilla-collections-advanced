Feature: FizzBuzz Game
  Whether the number is divisible by 3 or/and 5

  Scenario Outline: Number is or isn't divisible by 3 or/and 5
    Given number is <number> of value grater than zero
    When I ask whether the number is
    Then I should be told <answer>
    Examples:
      | number | answer |
      | divisible by three | "Fizz" |
      | divisible by five | "Buzz" |
      | divisible by three and five | "FizzBuzz" |
      | indivisible by three and/or five | "None" |