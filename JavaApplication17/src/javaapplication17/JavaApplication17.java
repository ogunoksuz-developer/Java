
package javaapplication17;
//import java.util.Scanner;
//import java.io.*;


public class JavaApplication17 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        char[] aalfabe = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'};
       int x = 0;
        char[] sifre={'d','a','t','g'};
           
        
        for(int j=0;j<=sifre.length;j++)
        {
           for(int k=0;k<=aalfabe.length;k++)
       {
         
       if(  (aalfabe[k]==sifre[j])) 
           
           System.out.print(k);
           
       }
       }
            
               
     
           
           
             
           
    }
             
}         
          
