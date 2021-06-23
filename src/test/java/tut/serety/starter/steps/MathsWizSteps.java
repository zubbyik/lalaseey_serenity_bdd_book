package tut.serety.starter.steps;

import net.thucydides.core.annotations.Step;
import tut.serety.starter.Calculator;

import static org.assertj.core.api.Assertions.assertThat;
public class MathsWizSteps {
    String actor;
    Calculator calculator;

    @Step("#actor starts with {1}")
    public void startsWith(int amount) {
        calculator = new Calculator(amount);
    }

    @Step("#actor adds {2}")
    public void adds(int amount) {
        calculator.add(amount);
    }

    @Step("#actor should have {3}")
    public void shouldHave(int expectedTotal) {
        assertThat(calculator.getTotal()).isEqualTo(expectedTotal);
    }
}
