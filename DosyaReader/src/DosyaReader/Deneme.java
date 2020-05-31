package deneme;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Deneme {

    public static void main(String[] args) {
        String[] veriler = new String[4];

        double ortalama, deger = 0;
        try {
            veriler = DosyaReader.dosyaOku();

            if (veriler != null) {
                for (int i = 0; i < veriler.length; i++) {

                    if (veriler[i] !=null ) {
                        if (  veriler[i].matches("^sayilar+[0-9| ]+#$")) {

                        String[] bolme1 = veriler[i].split("sayilar");
                        String[] bolme2 = bolme1[1].split("#");
                        String[] bolme3 = bolme2[0].split(" ");

                        for (int j = 0; j < bolme3.length; j++) {
                            deger += 1 / (Double.parseDouble(bolme3[j]));
                        }

                        ortalama = bolme3.length / deger;

                        System.out.println(ortalama);

                    } else {
                        System.out.println("Karakter katarı uygun degildir.");
                    }
                    }
                    else{
                        
                         System.out.println("Veri bulunamadı.Veriler dosyasını kontrol ediniz.");
                    }
                    

                }
            } else {
                System.out.println("Veri bulunamadı.");
            }

        } catch (Exception ex) {
              System.out.print(" Hata oluştu :" + ex.getMessage());
        }

    }

}
