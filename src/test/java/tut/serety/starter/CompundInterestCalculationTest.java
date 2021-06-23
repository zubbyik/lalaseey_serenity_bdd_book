package tut.serety.starter;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import tut.serety.starter.steps.BankUser;

@RunWith(SerenityRunner.class)
public class CompundInterestCalculationTest {

    @Steps
    BankUser kanye;

    @Test
    public void calculateCompoundInterest(){
//        Given the initial amount deposited is
        kanye.depositedInitialAmountInBank(2500.00);

//        When an savings interest of 5% is added at the end of the year
//        After One year;
        kanye.savingsPlusDepositBalanceAfterOneYear(0.05, 2625);

//        Then another savings interest of 5% is added at the end of the year
//        After Two years;
        kanye.savingsPlusDepositBalanceAfterTwoYears(0.05, 2756.25);

//        Then another savings interest of 5% is added at the end of the year
//        After Three years;
        kanye.savingsPlusDepositBalanceAfterThreeYears(0.05, 2894.0625);
    }


}
