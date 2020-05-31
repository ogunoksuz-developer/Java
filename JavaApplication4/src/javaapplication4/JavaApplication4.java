
package javaapplication4;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;



public class JavaApplication4 {
   public static void main(String[] args) {
       String[] veriler = new String[4];
        veriler=dosyaOku();
       for(int i=0;i<veriler.length;i++)
      {
     String deger=veriler[i].substring(0,7);
    
   String str="sayilar";
   if(deger.equals(str))
    { 
     String deger_1=veriler[i].substring(15,16);
     String str_1="#";
     if(deger_1.equals(str_1))
     {
        String deger_2=veriler[i].substring(9,10);
        String str_2=" ";
        if(deger_2.equals(str_2))
        {
        String deger_3=veriler[i].substring(12,13);
        String str_3=" ";
        if(deger_3.equals(str_3))
        {
       String deger_4=veriler[i].substring(7,9);
       String deger_5=veriler[i].substring(10,12);
       String deger_6=veriler[i].substring(13,15);
       
       double  a=Integer.parseInt(deger_4);
       double  b=Integer.parseInt(deger_5);
       double  c=Integer.parseInt(deger_6);
       
       double h;
       h=3/(1/a+1/b+1/c);
         System.out.println("harmonik ortalama:"+h);
        
   
       
           
        }else
        {
        System.out.println("karakter katarı uygun değildir");
        }
        
        }else
        {
        
        System.out.println("karakter katarı uygun değildir");
        }
     } else
     {
         System.out.println("karakter katarı uygun değildir");
     }
    }      else
   {
       System.out.println("karakter katarı uygun değildir");
               
   } 
       }
    
        
    
     
     
      
     
     

   }
    

    
    
    
    public static String[] dosyaOku()
	{
		String[] deneme = new String[4];
		int i=0;
		System.out.println("Reading datas from numbers.txt...");
		try {
			File file=new File("veriler.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line!=null)
			{
				deneme[i]=line;	
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
