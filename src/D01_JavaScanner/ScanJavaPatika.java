package D01_JavaScanner;

import java.util.Scanner;

public class ScanJavaPatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat,fizik,kimya,turkce,tarih,muzik;

        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.println("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = toplam / 6;

        System.out.println(ortalama > 60 ? "Gectiniz" : "Sınıfta kaldı");

    }
}
