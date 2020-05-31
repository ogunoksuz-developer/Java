//MUSTAFA KARACA B131200033
//OGUN OKSUZ B131200033
//20.4.2015
package deneme;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
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

        veriler = dosyaOku();

        for (int i = 0; i < veriler.length; i++) {

            if (veriler[i].matches("^sayilar+[0-9| ]+#$")) {

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

    }
    
    
    public static String[] dosyaOku() {
        String[] deneme = new String[4];
        int i = 0;
        try {
            File file = new File("veriler.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                deneme[i] = line;
                line = br.readLine();
                i++;
            }
            br.close();
        } catch (Exception a) {
            a.printStackTrace();
        }

        return deneme;
    }

}
