package tut.serety.starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import tut.serety.starter.steps.HotelUser;


@RunWith(SerenityRunner.class)
public class ThisIsACalculationOfAmountPaidForMealTest {

    @Steps
    HotelUser Einstein;

    @Test
    public void calculateTheTotalOfMealTipAndTax(){
        //    Given the cost of meal is 400
            Einstein.initialCostOfMeal(400);
        //    When The Tip is added to the cost of meal
            Einstein.addTipToCostOfMeal(0.18);
        //    And When the Tax is also added to the cost of the meal
            Einstein.addtTaxToCostOfMeal(0.50);
        //    Then the total output for the cost of the meal in the restaurant is
            Einstein.isExpectedToPay(672.00);
    }
}
