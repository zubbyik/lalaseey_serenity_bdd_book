package tut.serety.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.google.com")
public class GooglePage extends PageObject {


    public void search(String search) {
        find("//*[@name='q']").sendKeys(search);
    }
}
