package tut.serety.starter;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import tut.serety.starter.steps.MathsWizSteps;

@RunWith(SerenityRunner.class)
public class ASimpleTest {

    @Steps
    MathsWizSteps michael;

    @Test
public void addingSums(){
//    Given
        michael.startsWith(1);
//    When
        michael.adds(2);
//    Then
        michael.shouldHave(3);
}
}
