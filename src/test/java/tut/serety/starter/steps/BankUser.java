package tut.serety.starter.steps;


import net.thucydides.core.annotations.Step;
import tut.serety.starter.MyDeposit;

import static org.assertj.core.api.Assertions.assertThat;

public class BankUser {
    MyDeposit mydeposit;
    String actor;


    @Step("Initial deposit for #actor")
    public void depositedInitialAmountInBank(double initialDeposit) {
        mydeposit = new MyDeposit(initialDeposit);
    }

    @Step("Account Savings after One year is {1}")
    public void savingsPlusDepositBalanceAfterOneYear(double savingInterest, double expectedSavings) {
        assertThat(mydeposit.calculateYearOne(savingInterest)).isEqualTo(expectedSavings);
    }

    @Step("Account Savings after Two year is {1}")
    public void savingsPlusDepositBalanceAfterTwoYears(double savingInterest, double expectedSavings) {
        assertThat(mydeposit.calculateYearTwo(savingInterest)).isEqualTo(expectedSavings);
    }

    @Step("Account Savings after Three year is {1}")
    public void savingsPlusDepositBalanceAfterThreeYears(double savingInterest, double expectedSavings) {
        assertThat(mydeposit.calculateYearThree(savingInterest)).isEqualTo(expectedSavings);
    }
}
