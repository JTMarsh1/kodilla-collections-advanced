package fizzbuzz;

import fizzbuzz.FizzBuzzChecker;
import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {

    private int number;
    private String answer;

    public FizzBuzzSteps() {
        Given("number is divisible by three of value grater than zero", () -> {
            this.number = 3;
        });


        Given("number is divisible by five of value grater than zero", () -> {
            this.number = 5;
        });


        Given("number is divisible by three and five of value grater than zero", () -> {
            this.number = 15;
        });


        Given("number is indivisible by three and\\/or five of value grater than zero", () -> {
            this.number = 32;
        });

        When("I ask whether the number is", () -> {
            FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
            this.answer = fizzBuzzChecker.checkIfFizzBuzz(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });

    }
}