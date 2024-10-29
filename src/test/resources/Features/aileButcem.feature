Feature:Kullanici AileButcem uygulamasindaki gorevleri yapar

  Background:
    * ilk ekran ayarlarini yapin ve ardindan login sayfasina ulasin
    * "mail" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap"
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin


  Scenario Outline: Kullaniciuygulamadaki kullanici bilgilerini degistirir ve degistigini dogrular
    * sol kisimdaki menuden "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri degistirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" ve cinsiyet "Kadın" degisikleri kaydedin ve değişikleri dogrulayin
    * uygulamayi kapatir

    Examples:
      | isim      |  soyisim     | sehir       |   yas    |  meslek    |
      | isim1     |  soyisim1    | sehir1      |   yas1   |  meslek1   |
      | isim2     |  soyisim2    | sehir2      |   yas2   |  meslek2   |

  @144
  Scenario:Kullanici profil bilgilerini degistirir
    * sol kisimdaki menuden "Hesabım" bolumune gidin
    * hesabim sayfasindaki bilgileri degistirerek "isim" "soyisim" "sehir" "yas" "meslek" ve cinsiyet "Kadın" degisikleri kaydedin ve değişikleri dogrulayin
    * uygulamayi kapatir



  Scenario:Kullanici ayarlar bölümünde calisir
    * sol kisimdaki menuden "Ayarlar" bolumune gidin

  Scenario:Kullanici ayarlar bölümünde calisir
    * sol kisimdaki menuden "BIze Ulasin" bolumune gidin