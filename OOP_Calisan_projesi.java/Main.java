package Udemy_Calisan_projesi;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        // Kullanıcıya gösterilecek ana menü metni
        String islemler = "Calisanlar Programina Hos Geldiniz\n"+
                          "Islemler:\n"+
                          "1.Yazilimci islemleri\n"+
                          "2.Yonetici islemleri\n"+
                          "Programdan cikmak icin q'ya basin.";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");

        // Kullanıcı çıkış yapana kadar ana döngü
        while ( true ){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Islem Secin: ");
            String islem = scanner.nextLine();

            // Kullanıcının çıkış yapmak istemesi durumu
            if( islem.equals("q")){
                System.out.println("Programmdan cikiliyor...");
                break;
            }
            // Yazılımcı işlemleri seçilirse
            else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Burak", "Sofu", 3622346, "Python, Java, C");
                String yazilimci_islemleri = "\nYazilimci islemleri:\n"+
                                             "1.Format at\n"+
                                             "2.Bilgileri goster\n"+
                                             "Cikis icin q'ya basin";
                System.out.println(yazilimci_islemleri);

                // Yazılımcı işlemleri döngüsü
                while ( true ){
                    System.out.print( "Islem secin:");
                    String y_islem = scanner.nextLine();

                    // Yazılımcı işlemlerinden çıkış yapma durumu
                    if( y_islem.equals("q")){
                        System.out.println("Yazilimci islemlerinden cikiliyor...");
                        break;
                    }
                    // Format atma işlemi
                    else if( y_islem.equals("1")){
                        System.out.print("Format atilacak isletim sistemi girin:");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    // Bilgileri gösterme işlemi
                    else if( y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else
                    {
                        System.out.println("Gecersiz secim...");
                    }
                }
    
            }
            // Yönetici işlemleri seçilirse
            else if(islem.equals("2")){
                    Yonetici yonetici = new Yonetici ("Emrah", "Mete", 315125, 10);

                    String yonetici_islemleri = "\nYonetici islemleri:\n"+
                                                "1.Zam yap\n"+
                                                "2.Bilgileri goster\n"+
                                                "Cikis icin q'ya basin";
                    System.out.println(yonetici_islemleri);

                    // Yönetici işlemleri döngüsü
                    while ( true){
                        System.out.println("Islem secin:");
                        String yonetici_islem=scanner.nextLine();
                        // Yönetici işlemlerinden çıkış yapma durumu
                        if( yonetici_islem.equals("q")){
                            System.out.println("Yonetici islemlerinden cikiliyor...");
                            break;
                        }
                        // Zam yapma işlemi
                        else if(yonetici_islem.equals("1")){
                            System.out.print("Zam miktarini girin:");
                            int zam_miktari= scanner.nextInt();
                            scanner.nextLine();

                            yonetici.zamYap(zam_miktari);
                        }
                        // Bilgileri gösterme işlemi
                        else if(yonetici_islem.equals("2")){
                            yonetici.bilgileriGoster();
                        }
                        else{
                            System.out.println("Gecersiz secim...");
                        }
                    }
            }
            // Geçersiz bir seçenek girildiyse
            else{
                System.out.println("Gecersiz secim...");
            }
        }
        
        // Program sonlandığında mesaj
        System.out.println("\nDerleme Sonlandirildi... \n\n");
    }
}
