package tut.serety.intermediate;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import tut.serety.intermediate.steps.WebNavigator;

@RunWith(SerenityRunner.class)
public class CountGooglePages {
    @Steps
    WebNavigator webuser;

    @Test
    public void openGoogleForm(){
        webuser.openGooglePage();
    }

    @Test
    public void searchGoogleMethos(){
        webuser.searchGoogleForm("goose");
    }
}
