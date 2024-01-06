
// Yonetici sınıfı, Calisan sınıfından türetilmiş ve yönetici özelliklerini içerir
public class Yonetici extends Calisan {

    // Yoneticinin sorumlu olduğu kişi sayısı
    private int sorumlu_kisi_sayisi;

    // Yonetici sınıfının yapıcı metodu (constructor)
    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        // Calisan sınıfının yapıcı metodunu çağırarak temel özellikleri ayarlar
        super(ad, soyad, id);

        // Yonetici sınıfına özgü sorumlu_kisi_sayisi özelliğini ayarlar
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    // Calisan sınıfının bilgilerini gösteren metodu override eder
    @Override
    public void bilgileriGoster(){
        // Calisan sınıfının bilgilerini gösteren metodu çağırır
        super.bilgileriGoster();
        // Yonetici sınıfına özgü sorumlu_kisi_sayisi özelliğini gösterir
        System.out.println("Yoneticinin sorumlu oldugu kisiler: " + sorumlu_kisi_sayisi);
    }

    // Yonetici sınıfına özgü bir metot: Belirtilen miktarda zam yapma
    public void zamYap(int zamMiktari){
        System.out.println(getAd() + " Calisanlara " + zamMiktari + " kadar zam yapiliyor..."); 
    }
}
