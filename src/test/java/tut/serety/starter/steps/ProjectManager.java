package tut.serety.starter.steps;

import net.thucydides.core.annotations.Step;
import tut.serety.starter.Square;

import static org.assertj.core.api.Assertions.assertThat;

public class ProjectManager {
    Square initSquare;
    String actor;

    @Step("When #actor is presented with an initial dimensions, where width is {0} and height is {1}")
    public void givenAnInitialNumber(int width, int height) {
        initSquare = new Square(width, height);
    }

    @Step("And #actor then calculate the area of this polygon")
    public void calculateTheAreaOfTheSquare() {
        initSquare.calcualteArea();
    }

    @Step("The #actor should get the result of the Area as {0}")
    public void shouldGetTheResultAs(int expectedArea) {
        assertThat(initSquare.getArea()).isEqualTo(expectedArea);
    }
}
