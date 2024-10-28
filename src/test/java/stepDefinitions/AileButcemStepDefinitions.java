package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utilities.ConfigReader;

public class AileButcemStepDefinitions {
    AileButcemPage page=new AileButcemPage();

    @Given("ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin() throws InterruptedException {
        Thread.sleep(2000);
        page.ilkekranayarlari();

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string}")
    public void ve_bilgilerini_girerek_kullanici_bilgileriyle(String mail,String password,String girisYap) {
        page.emailkutusu.sendKeys(ConfigReader.getProperty(mail));
        page.sifrekutusu.sendKeys(ConfigReader.getProperty(password));
        page.girisYapButonuu.click();
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {
        Assert.assertTrue(page.girisYazisiDogrulama.isDisplayed());

    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_bolumune_gidin(String menuSecim) throws InterruptedException {
        Thread.sleep(1000);
        page.hamburgerbuton.click();
        page.hesabimbuton.click();
    }


    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} ve cinsiyet {string} degisikleri kaydedin ve değişikleri dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_ve_cinsiyet_degisikleri_kaydedin_ve_değişikleri_dogrulayin(String isim, String soyisim, String sehir, String yas, String meslek, String cinsiyet) throws InterruptedException {
        page.hesabimTextSendkeysMehtodu(isim,soyisim,sehir,yas,meslek,cinsiyet);
        Thread.sleep(1000);
        page.degisikliklerkaydedildibutonu.isDisplayed();

    }



    @Given("uygulamayi kapatir")
    public void uygulamayi_kapatir() {

    }
}