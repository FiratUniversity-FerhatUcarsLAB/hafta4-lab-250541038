/*
 * Ad Soyad:Muhammed Metin Kızıl
 * Ogrenci No: 250541038
 * Tarih: 29.10.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan yarıçap bilgisini alir ve
 * duzenli bir formatta sonucu ekrana yazdirir.
 */



import  java.util.Scanner;

    public class GeometrikHesaplayici {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.printf(" Yarıcap Giriniz : ");
            double yaricap = input.nextDouble();

            System.out.println(" SONUÇLAR      :");

            double pi = 3.1415f;

            double alan = pi * Math.pow(yaricap,2);

            System.out.printf(" Daire alanı   :     %.2f",alan);

            double cevre = 2 * pi * yaricap;
            System.out.printf("\n Daire Çevresi :     %.2f",cevre);

            double cap = 2 * yaricap;
            System.out.printf("\n Daire Çapı    :     %.2f",cap);

            double Kurenin_hacmi = 4.0/3.0 * pi * Math.pow(yaricap,3);
            System.out.printf("\n kürenin hacmi :     %.2f", Kurenin_hacmi);

            double Kurenin_yuzey_alanı = 4.0 * pi * Math.pow(yaricap,2);
            System.out.printf("\n Yüzey Alanı   :     %.2f", Kurenin_yuzey_alanı);



            }
        }


