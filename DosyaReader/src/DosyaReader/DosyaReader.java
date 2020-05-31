/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deneme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author ogun
 */
public class DosyaReader {
    public static String[] dosyaOku() {
        String[] deneme = new String[4];
        File file;

        int i = 0;
        try {
            file = new File("veriler.txt");

            if (file.exists()) {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while (line != null) {
                    deneme[i] = line;
                    line = br.readLine();
                    i++;
                }

                br.close();
            }

        } catch (Exception a) {
            a.printStackTrace();
        } finally {

        }

        return deneme;
    }
}
