package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.BrowserDriver;

public class BrowserStepDefinitions {

    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com");

    }
}
