

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		Random uretici=new Random();
		int randomAdet=uretici.nextInt(90)+10;//10-99 arasinda rasgele sayi uretiliyor
		String sayiDizi []=new int [randomAdet];
		double carpim;
		double geometrikOrt;
		
		for(int i=0; i<randomAdet; i++) {
			sayiDizi[i]=uretici.nextInt(500)+500;//500-999 arasinda rasgele sayi uretiliyor...
		}
		
		dosyaYaz(sayiDizi, randomAdet);
		carpim=dosyaOku();
		geometrikOrt=Math.pow(carpim, 1.0/randomAdet);
			
		
		System.out.printf("Ortalama: %.2f", geometrikOrt);

	}
	
	public static void dosyaYaz(int numArray [], int randomAdet)
	{
		try
        {
            File dosya = new File("numbers.txt");
            
            // disarida olusturdugumuz dosyanin icine yazma islemini gerceklestirecek nesneyi olusturduk
            PrintWriter out = new PrintWriter(dosya);
            for (int i =0; i<randomAdet; i++)
            {
                out.println(numArray[i]);
            }               
            out.close();
        }
		
		/*** yukarida dosyayi olusturup icine istedigimiz verileri yazdirdikdan sonra kaydedip cikiyoruz.
		  *   yukarida olusabilecek hatayi burda kullaniciya hata kodu ile gosteriyoruz
		***/
		catch (Exception e) {
			System.err.println("Hata: " + e.getMessage());
		}
		
	}
	
	public static String[] dosyaOku()
	{
		String [] deneme=new String();
		Ýnt i=0;
		System.out.println("Reading datas from numbers.txt...");
		try {
			File file=new File("numbers.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null)
			{
				Deneme[i]=line;	
				line=br.readLine();
				i++;
			}
			br.close();
		} catch(Exception a) {
			a.printStackTrace();
		}
		
		return deneme;
	}
	

}
