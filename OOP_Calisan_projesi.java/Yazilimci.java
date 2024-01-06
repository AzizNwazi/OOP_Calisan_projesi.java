
// Yazilimci sınıfı, Calisan sınıfından türetilmiş ve yazılımcı özelliklerini içerir
public class Yazilimci extends Calisan {

    // Yazilimcinin bildiği programlama dilleri
    private String diller;

    // Yazilimci sınıfının yapıcı metodu (constructor)
    public Yazilimci(String ad, String soyad, int id, String diller) {
        // Calisan sınıfının yapıcı metodunu çağırarak temel özellikleri ayarlar
        super(ad, soyad, id);
        
        // Yazilimci sınıfına özgü diller özelliğini ayarlar
        this.diller = diller;
    }

    // Yazilimci sınıfına özgü bir metot: Belirtilen işletim sistemini yükleme
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " " + isletim_sistemi + " ni yüklüyor...");
    }

    // Calisan sınıfının bilgilerini gösteren metodu override eder
    @Override
    public void bilgileriGoster(){
        // Calisan sınıfının bilgilerini gösteren metodu çağırır
        super.bilgileriGoster();
        // Yazilimci sınıfına özgü diller özelliğini gösterir
        System.out.println("Yazilimcinin bildiği diller: " + diller);
    }
}
