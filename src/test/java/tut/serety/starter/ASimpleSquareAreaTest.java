package tut.serety.starter;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import tut.serety.starter.steps.ProjectManager;

@RunWith(SerenityRunner.class)
public class ASimpleSquareAreaTest {

    @Steps
    ProjectManager tega;

    @Test
    public void calculateTheAreaOfASquare(){
//        Given
        tega.givenAnInitialNumber(4, 4);
//        When
        tega.calculateTheAreaOfTheSquare();
//        Then
        tega.shouldGetTheResultAs(16);
    }

}
