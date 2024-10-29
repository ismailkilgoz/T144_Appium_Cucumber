Feature:Kullanici obilet sayfasindaki fonksiyonlari acar
  @browser
  Scenario: Kullanici dil ve para ayarlarini degistirir ve dogrular
    * "url" sayfasina gidilir
    * dil olarak turkce secilir
    * para birimi olarak tl secilir
    * otobus bileti bul a tiklanir
    * gelen bilet fiyatlarinin tl oldugu dogrulanir