package tut.serety.intermediate.steps;

import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class Astrologist {
   EarthPointA pointa;
   EarthPointB pointb;
   double distance;
   String actor;

   @Step("Initial points for position A on the Earth are latitude {0} and Longtitude {1} presented to #actor")
    public void setInitialPointsA(double latitude, double longtitude) {
        this.pointa = new EarthPointA(latitude, longtitude);
    }

    @Step("Initial points for position B on the Earth are latitude {0} and Longtitude {1}")
    public void setInitialPointsB(double latitude, double longtitude) {
        this.pointb = new EarthPointB(latitude, longtitude);
    }


    @Step("calculating the distance between point A and B")
    public double calculateTheDistance() {
        //distance = 6371.01 × arccos(sin(t1) × sin(t2) + cos(t1) × cos(t2) × cos(g1 − g2))
        // t1 = 35.6544, t2 = 21.4225
        // s1 = 139.74477, s2 = 39.8261
        this.distance = 6371.01 * Math.acos(Math.sin(pointa.getLatitude())
                * Math.sin(pointb.getLatitude())
                + Math.cos(pointa.getLatitude()) * Math.cos(pointb.getLatitude())
                * Math.cos(pointa.getLongtitude() - pointb.getLongtitude()));
        return this.distance;
    }

    @Step("The Distance that #autor should be getting must be equal to {0}")
    public void shouldBeEqualTo(double expectedDistance) {
        assertThat(this.calculateTheDistance()).isEqualTo(expectedDistance);
    }
}
