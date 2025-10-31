/*
 * Ad Soyad:Muhammed Metin Kızıl
 * Ogrenci No: 250541038
 * Tarih: 29.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan çalışan bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Locale;
import java.util.Scanner;

public class MaasHesaplama {

    public static void main(String[] args) {

        // --- YENİ EKLENEN KISIM: Kullanıcıdan Veri Alma ---
        // Locale.US ile Scanner'ı başlatıyoruz ki ondalık sayılar nokta (.) ile girilebilsin
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("=== Maaş Bordrosu Hesaplama Programı ===");
        System.out.println("Lütfen çalışan bilgilerini giriniz:");

        // 1. Girdi Bilgileri (Kullanıcıdan alınıyor)
        System.out.print("Çalışan Adı Soyadı: ");
        String calisanAdi = scanner.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = scanner.nextDouble();

        System.out.print("Mesai Saati (saat): ");
        int mesaiSaati = scanner.nextInt();
        // --- Veri Alma Kısmı Bitti ---


        // 2. Hesaplamalar

        // Gelirler
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // Kesintiler
        double sgkKesintisi = toplamGelir * 0.14;   // %14.0
        double gelirVergisi = toplamGelir * 0.15;   // %15.0


        double damgaVergisiOrani = 0.00759;
        double damgaVergisi = toplamGelir * damgaVergisiOrani;
        String damgaVergisiEtiketi = "0.8%"; // Ekranda gösterilecek etiket

        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        // Net Maaş
        double netMaas = toplamGelir - toplamKesinti;

        // 3. Çıktıyı Formatlama



        System.out.println();

        System.out.println("=================================");
        System.out.println("         MAAS BORDROSU         ");
        System.out.println("=================================");
        System.out.println("Calisan: " + calisanAdi);
        System.out.println(); // Boş satır
        System.out.println("GELIRLER:");

        // printf ile formatlama:
        // %-26s : Sola dayalı 26 karakterlik alan ayır (Etiket için)
        // %10.2f  : Sağa dayalı, toplam 10 karakterlik, virgülden sonra 2 basamaklı sayı (Tutar için)
        System.out.printf(Locale.US, "   %-26s : %10.2f TL\n", "Brut Maas", brutMaas);
        System.out.printf(Locale.US, "   %-26s : %10.2f TL\n", "Mesai Ucreti (" + mesaiSaati + " saat)", mesaiUcreti);
        System.out.println("   --------------------");
        System.out.printf(Locale.US, "   %-26s : %10.2f TL\n", "TOPLAM GELIR", toplamGelir);
        System.out.println(); // Boş satır
        System.out.println("KESINTILER:");
        System.out.printf(Locale.US, "   %-26s : %10.2f TL\n", "SGK Kesintisi (14.0%)", sgkKesintisi);
        System.out.printf(Locale.US, "   %-26s : %10.2f TL\n", "Gelir Vergisi (15.0%)", gelirVergisi);
        System.out.printf(Locale.US, "   %-26s : %10.2f TL\n", "Damga Vergisi (" + damgaVergisiEtiketi + ")", damgaVergisi);
        System.out.println("   --------------------");
        System.out.printf(Locale.US, "   %-26s : %10.2f TL\n", "TOPLAM KESINTI", toplamKesinti);
        System.out.printf(Locale.US, "   %-26s : %10.2f TL\n", "NET MAAS", netMaas);
        System.out.println("=================================");

        // Kullandığımız scanner'ı kapatıyoruz
        scanner.close();
    }
}
