/*
 * Ad Soyad:Muhammed Metin Kızıl
 * Ogrenci No: 250541038
 * Tarih: 29.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import  java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {

        // Değişkenler Alınıyor
        Scanner input = new Scanner(System.in);

        System.out.print("Adınızı Giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınızı Giriniz: " );
        String soyad = input.nextLine();

        System.out.print("Öğrenci Numaranızı Giriniz: ");
        int numaran = input.nextInt();

        System.out.print("Yaşınız: ");
        int yas = input.nextInt();

        System.out.printf("GPA (0.00-4.00): ");
        float gpa = input.nextFloat ();

        //Bilgiler ekrana yazdırılıyor
        System.out.println("=== OGRENCİ BİLGİ SİSTEMİ ===" );
        System.out.printf("Ad Soyad: %s %s", ad, soyad);
        System.out.printf("\nÖğrenci No : %d", numaran);
        System.out.printf("\nYaş:%d",yas);
        System.out.printf("\nGPA:%.2f",gpa);

    }

}
