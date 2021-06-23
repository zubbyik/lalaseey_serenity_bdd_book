package tut.serety.starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import tut.serety.starter.steps.MultiplicationWiz;

@RunWith(SerenityRunner.class)
public class ASimpleMultiplicationTest {

    @Steps
    MultiplicationWiz Ikem;

    @Test
    public void authorMultiplySomeNumbers(){

//        Given
        Ikem.startWithNumber(1);
//        When
        Ikem.multiplyNumberWith(4);
//        Then
        Ikem.shouldHaveAProductOf(4);
    }
}
