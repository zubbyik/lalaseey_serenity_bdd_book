package tut.serety.starter.steps;

import net.thucydides.core.annotations.Step;
import tut.serety.starter.Multiplier;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplicationWiz {
    Multiplier multiplier;
    String actor;

    @Step("#actor has an initial number {0}")
    public void startWithNumber(int amount) {
        multiplier = new Multiplier(amount);
    }

    @Step("#actor then multiply initial number by {0}")
    public void multiplyNumberWith(int multiple) {
        multiplier.multiplyBy(multiple);
    }

    @Step("#actor should have a product of {0}")
    public void shouldHaveAProductOf(int product) {
        assertThat(multiplier.getMultpiple()).isEqualTo(product);
    }
}
