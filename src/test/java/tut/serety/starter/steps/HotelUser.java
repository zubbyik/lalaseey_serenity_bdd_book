package tut.serety.starter.steps;

import net.thucydides.core.annotations.Step;
import tut.serety.starter.Meal;

import static org.assertj.core.api.Assertions.assertThat;

public class HotelUser {
    Meal meal;
    String actor;

    @Step("Given the cost of meal is presented to #actor is {0}")
    public void initialCostOfMeal(double initialCost) {
        meal = new Meal(initialCost);
    }

    @Step("When The Tip of {0} is added to the cost of meal")
    public void addTipToCostOfMeal(double tip) {
        meal.addTip(tip);
    }

    @Step("And When the Tax of {0} is also added to the cost of the meal")
    public void addtTaxToCostOfMeal(double tax) {
        meal.addtax(tax);
    }

    @Step(" Then the total output for the cost of the meal in the restaurant presented to #actor is {0}")
    public void isExpectedToPay(double expectedTotal) {
        assertThat(meal.getTotal()).isEqualTo(expectedTotal);
    }
}
