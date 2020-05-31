/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author mseven
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String kelime = "sayilar1234a";
        
        
        for (int i = 0; i < kelime.length(); i++) {
            if(Character.isDigit(kelime.charAt(i))){
                System.out.println(kelime.charAt(i));
            }
        }
        
        
        
    }
    
    
}

