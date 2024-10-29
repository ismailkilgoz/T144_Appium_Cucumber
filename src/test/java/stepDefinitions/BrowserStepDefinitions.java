package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ObiletPage;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class BrowserStepDefinitions {

    ObiletPage page=new ObiletPage();

    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com");

        BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='sf-hb-button-dMT9LZe9Dk8_WxAL5MH7 sf-default-header-fyaJ3u6_nqj_jDEekaEb hb-button__icon']")
                .isDisplayed();
    }

    @Given("{string} sayfasina gidilir")
    public void sayfasina_gidilir(String url) {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(url));
    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {
        page.hamburgerMenu.click();
        page.dilSecenegibutonu.click();
        page.turkishbutonu.click();

    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() throws InterruptedException {
        page.hamburgerMenu.click();
        page.currencySelect.click();
        Thread.sleep(5000);
        page.turkisLira.click();
    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {
        page.saerchButon.click();
    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir() {
        String trFiyat=page.TRfiyatbilgisi.getText();
        Assert.assertTrue(trFiyat.equals("TL"));
    }

}
