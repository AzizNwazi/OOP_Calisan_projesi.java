package Udemy_Calisan_projesi;

// Calisan sınıfı, genel bir çalışanı temsil eder
public class Calisan {

    // Calisanın adı
    private String ad;
    
    // Calisanın soyadı
    private String soyad;
    
    // Calisanın kimlik numarası (ID)
    private int id;

    // Calisan sınıfının yapıcı metodu (constructor)
    public Calisan(String ad, String soyad, int id) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
    }

    // Calisanın adını getiren metot
    public String getAd() {
        return ad;
    }

    // Calisanın adını set eden metot
    public void setAd(String ad) {
        this.ad = ad;
    }

    // Calisanın soyadını getiren metot
    public String getSoyad() {
        return soyad;
    }

    // Calisanın soyadını set eden metot
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    // Calisanın ID'sini getiren metot
    public int getId() {
        return id;
    }

    // Calisanın ID'sini set eden metot
    public void setId(int id) {
        this.id = id;
    }

    // Calisan bilgilerini konsola yazdıran metot
    public void bilgileriGoster(){
        System.out.println("Calisan bilgileri...");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: "+soyad);
        System.out.println("ID: "+id);
    }
}
