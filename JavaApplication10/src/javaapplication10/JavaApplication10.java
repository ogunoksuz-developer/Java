
package javaapplication10;
 import java.util.*;


public class JavaApplication10 {

    
     
    public static void main(String[] args) {
       int boy,en,kucuk1_boy,kucuk1_en,kucuk2_boy, kucuk2_en,a,b,c,d,x,y,f_1,f_2,max1,max2,max3,h1,h2,kesicinin_kalınlığı; 
        Scanner k =new Scanner(System.in);
         System.out.println("ana maleze boy:");
         boy=k.nextInt();
         System.out.println("ana maleze en:");
         en=k.nextInt();
         System.out.println("kucuk 1 boy:");
         kucuk1_boy=k.nextInt();
         System.out.println("kucuk 1 en :");
         kucuk1_en=k.nextInt();
        System.out.println("kucuk 2 boy:");
         kucuk2_boy=k.nextInt();
         System.out.println("kucuk 2 en:");
         kucuk2_en=k.nextInt();
         System.out.println("1.maddenin fiyatı");
         f_1=k.nextInt();
         System.out.println("2.maddenin fiyatı:");
         f_2=k.nextInt();
         System.out.println("kesicinin kalınlıgı gir");
         kesicinin_kalınlığı=k.nextInt();
         a=boy/(kucuk1_boy+kesicinin_kalınlığı);
         b=en/(kucuk1_en+kesicinin_kalınlığı);
         x=a*b;
        System.out.println("1.maddeden cikacak max deger;"+x);
        c=boy/(kucuk2_boy+kesicinin_kalınlığı);
        d=en/(kucuk2_en+kesicinin_kalınlığı);
        y=c*d;
        System.out.println("2.maddeden cikacak max deger;"+y);
        max1=0*x+f_2*y;
        max2=f_1*x+0*y;
        
        
         
         
         
        
    }
    
}
