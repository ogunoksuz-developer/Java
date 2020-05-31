package kaynak;

import java.util.*;

public class Kaynak {

    public static void main(String[] args) {
        Scanner k;
        byte secim = 0;
        double b_nok = 0, k_boyu = 0, r = 0, e = 0, kangal = 0, sonuc = 0, tl = 0, maliyet = 0, L = 0;
        k = new Scanner(System.in);

       

        do {
            System.out.println("1-alın\n2-köşe\n3-bindirme\n4-T\n5-kenar");
            System.out.print("menüden bir işlem seçiniz");
            secim = k.nextByte();

            Karar(k, secim, b_nok, k_boyu, r, e, kangal, sonuc, tl, maliyet, L);
            System.out.print("Devam etmek ister misiniz? 1 yada 0");
            

        } while (secim != 0);

        System.out.print("güle güle");
    }

    private static void Karar1(Scanner k, double b_nok, double k_boyu, double r, double e, double kangal, double sonuc, double tl, double maliyet, double L) {
        System.out.print("kaç tane birleştirme noktası kullanıcaksınız");
        b_nok = k.nextInt();
        System.out.print("kaynak yapılacak boyu giriniz");
        k_boyu = k.nextInt();
        System.out.print("kaynak uzunluğunu giriniz");
        L = k.nextInt();

        e = (L) * b_nok * k_boyu;
        System.out.println(e + "tane elektrot kullanılır");
        System.out.println("bir kangal kaç metre");
        kangal = k.nextInt();
        sonuc = e / kangal;
        System.out.println(sonuc + "kangal kullanılır");
        System.out.println("elektrotun metrsi ne kadar");
        tl = k.nextInt();
        maliyet = tl * e;
        System.out.println(maliyet + "tl kullanılır");

    }

    private static void Karar2(Scanner k, double b_nok, double k_boyu, double r, double e, double kangal, double sonuc, double tl, double maliyet, double L) {
        System.out.print("kaç tane birleştirme noktası kullanıcaksınız");
        b_nok = k.nextInt();
        System.out.print("kaynak yapılacak boyu giriniz");
        k_boyu = k.nextInt();
        System.out.print("yarı çapı giriniz");
        r = k.nextInt();
        r = r / 1000;
        e = ((3 * r * r) / 4) * b_nok * k_boyu;
        System.out.println(e + "tane elektrot kullanılır");
        System.out.println("bir kangal kaç metre");
        kangal = k.nextInt();
        sonuc = e / kangal;
        System.out.println(sonuc + "kangal kullanılır");
        System.out.println("elektrotun metrsi ne kadar");
        tl = k.nextInt();
        maliyet = tl * e;
        System.out.println(maliyet + "tl kullanılır");

    }

    private static void Karar3(Scanner k, double b_nok, double k_boyu, double r, double e, double kangal, double sonuc, double tl, double maliyet, double L) {

        System.out.print("kaç tane birleştirme noktası kullanıcaksınız");
        b_nok = k.nextInt();
        System.out.print("kaynak yapılacak boyu giriniz");
        k_boyu = k.nextInt();
        System.out.print("kaynak uzunluğunu giriniz");
        L = k.nextInt();

        e = (L) * b_nok * k_boyu;
        System.out.println(e + "tane elektrot kullanılır");
        System.out.println("bir kangal kaç metre");
        kangal = k.nextInt();
        sonuc = e / kangal;
        System.out.println(sonuc + "kangal kullanılır");
        System.out.println("elektrotun metrsi ne kadar");
        tl = k.nextInt();
        maliyet = tl * e;
        System.out.println(maliyet + "tl kullanılır");

    }

    private static void Karar4(Scanner k, double b_nok, double k_boyu, double r, double e, double kangal, double sonuc, double tl, double maliyet, double L) {

        System.out.print("kaç tane birleştirme noktası kullanıcaksınız");
        b_nok = k.nextInt();
        System.out.print("kaynak yapılacak boyu giriniz");
        k_boyu = k.nextInt();
        System.out.print("yarı çapı giriniz");
        r = k.nextInt();
        r = r / 1000;
        e = ((3 * r * r) / 4) * b_nok * k_boyu;
        System.out.println(e + "tane elektrot kullanılır");
        System.out.println("bir kangal kaç metre");
        kangal = k.nextInt();
        sonuc = e / kangal;
        System.out.println(sonuc + "kangal kullanılır");
        System.out.println("elektrotun metrsi ne kadar");
        tl = k.nextInt();
        maliyet = tl * e;
        System.out.println(maliyet + "tl kullanılır");

    }

    private static void Karar5(Scanner k, double b_nok, double k_boyu, double r, double e, double kangal, double sonuc, double tl, double maliyet, double L) {
        System.out.print("kaç tane birleştirme noktası kullanıcaksınız");
        b_nok = k.nextInt();
        System.out.print("kaynak yapılacak boyu giriniz");
        k_boyu = k.nextInt();
        System.out.print("kaynak uzunluğunu giriniz");
        L = k.nextInt();

        e = (L) * b_nok * k_boyu;
        System.out.println(e + "tane elektrot kullanılır");
        System.out.println("bir kangal kaç metre");
        kangal = k.nextInt();
        sonuc = e / kangal;
        System.out.println(sonuc + "kangal kullanılır");
        System.out.println("elektrotun metrsi ne kadar");
        tl = k.nextInt();
        maliyet = tl * e;
        System.out.println(maliyet + "tl kullanılır");
    }

    private static void Karar(Scanner k, byte secim, double b_nok, double k_boyu, double r, double e, double kangal, double sonuc, double tl, double maliyet, double L) {

        if (secim == 1) {
            Karar1(k, b_nok, k_boyu, r, e, kangal, sonuc, tl, maliyet, L);
        } else if (secim == 2) {
            Karar2(k, b_nok, k_boyu, r, e, kangal, sonuc, tl, maliyet, L);
        } else if (secim == 3) {
            Karar3(k, b_nok, k_boyu, r, e, kangal, sonuc, tl, maliyet, L);
        } else if (secim == 4) {
            Karar4(k, b_nok, k_boyu, r, e, kangal, sonuc, tl, maliyet, L);
        } else if (secim == 5) {
            Karar5(k, b_nok, k_boyu, r, e, kangal, sonuc, tl, maliyet, L);
        } else {
            System.out.println(" 1 ile 5 arasında bir secim yapınız");
        }
    }
}
