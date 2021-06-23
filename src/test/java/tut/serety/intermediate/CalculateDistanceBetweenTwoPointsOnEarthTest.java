package tut.serety.intermediate;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import tut.serety.intermediate.steps.Astrologist;


@RunWith(SerenityRunner.class)
public class CalculateDistanceBetweenTwoPointsOnEarthTest {

    @Steps
    Astrologist astrologist;

    @Test
    public void calculateTheDistanceBetweenTwoPointsOnTheEarth(){
        // Give there is point A on the surface of the earth

        astrologist.setInitialPointsA(21.4225, 39.8261);

        // And there is point B on the surface of the Earth

        astrologist.setInitialPointsB(35.6544, 139.74477);

        // When the distance between the two points are calculated

        astrologist.calculateTheDistance();

        //Then the distance between point A and B for any given latitude for any Given latitude will be;

        astrologist.shouldBeEqualTo(11060.071172721613);
    }
}
