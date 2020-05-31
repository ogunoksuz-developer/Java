

package javaapplication3;
import java.util.*;

public class JavaApplication3 {

    
    public static void main(String[] args) {
   
        Scanner k =new Scanner(System.in);
     double a,b,uzun_kenar,kisa_kenar,parça_uzunluk,parça_kenar,kesicinin_kalınlığı;
    double h1,h2,h3,h4,top_hurda;
   
       System.out.println("uzun kenarı giriniz:");
        uzun_kenar=k.nextInt();      
        System.out.println("kisa kenari giriniz:");  
        kisa_kenar=k.nextInt();
   
         System.out.print("parçanın uzunlugunu giriniz:");
        parça_uzunluk=k.nextInt();
        System.out.print("parçanın kenarını giriniz:");
        parça_kenar=k.nextInt();
        System.out.print("kesicinin kalınlığı giriniz:");
        kesicinin_kalınlığı=k.nextInt();
        kesicinin_kalınlığı=kesicinin_kalınlığı/1000;
      a= (uzun_kenar/( parça_uzunluk+kesicinin_kalınlığı));
      System.out.println("uzun kenardan çıkıcak kenar miktarı:"+a);
      b=(kisa_kenar/(parça_kenar+kesicinin_kalınlığı));
      System.out.println("kısa kenardan çıkıcak kenar miktarı:"+b);
      h1=(uzun_kenar%( parça_uzunluk+kesicinin_kalınlığı));
      h2=(kisa_kenar%(parça_kenar+kesicinin_kalınlığı));
      h3=(a-1)*b*kesicinin_kalınlığı;
      h4=a*(b-1)*kesicinin_kalınlığı;
     top_hurda=h1+h2+h3+h4;
     
     System.out.println("hurda miktarı"+top_hurda);

   
  }
    
}
