package steps;

import com.example.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    private final Calculator calculator = new Calculator();
    private int input1;
    private int input2;

    @Given("^I have entered (\\d+) into the calculator$")
    public void i_have_entered_into_the_calculator(int number) {
        if (input1 == 0) {
            input1 = number;
        } else {
            input2 = number;
        }
    }

    @When("^I press add$")
    public void i_press_add() {
        calculator.add(input1, input2);
    }

    @Then("^the result should be (\\d+) on the screen$")
    public void the_result_should_be_on_the_screen(int expected) {
        Assertions.assertEquals(expected, calculator.getResult());
    }
}
