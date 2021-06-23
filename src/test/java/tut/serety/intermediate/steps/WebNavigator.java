package tut.serety.intermediate.steps;

import net.thucydides.core.annotations.Step;
import tut.serety.pages.GooglePage;

public class WebNavigator {
    GooglePage googlePage;

    @Step
    public void openGooglePage() {
        googlePage.open();
    }

    @Step
    public void searchGoogleForm(String search) {
        googlePage.search(search);

    }


}
