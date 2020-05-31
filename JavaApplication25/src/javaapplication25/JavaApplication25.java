package javaapplication25;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int wsayisi = 0;
        int dizi[][];

        System.out.println("Please enter number of row :");
        int row = input.nextInt();
        System.out.println("Please enter number of column :");
        int column = input.nextInt();
        dizi = new int[row][column];

        if (5 <= row && row <= 50) {
            if (5 <= column && column <= 50) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(" || ");
                        dizi[i][j] = (int) (Math.random() * 4);

                        switch (dizi[i][j]) 
                        {
                            case 0:
                                System.out.print("W");
                                break;
                            case 1:
                                System.out.print("R");
                                break;
                            case 2:
                                System.out.print("G");
                                break;
                            case 3:
                                System.out.print("B");
                                break;
                        }
                        if (Character.isLetter(i) || Character.isLetter(j)) {
                            System.out.print("   " + dizi[i][j] + "  ");
                        }
                    }
                    System.out.println("");
                }

            }

        } else {
            System.out.println("Please rerun this program and enter numbers which are from 5 to 50 ");
        }
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if (dizi[i][j] == 0) {
                    
                    if (dizi[0][0]==0) {
                        int deneme1=dizi[0][1];
                        int deneme2=dizi[1][1];
                        int deneme3=dizi[1][0];
                        if(deneme1==deneme2)
                        {
                        if(deneme3==deneme1){
                        dizi[0][0]=dizi[1][1];
                          
                        }
                        
                        }
                        
                        
                        }
                        
                        
                    }

//                  int deneme1=dizi[i-1][j-1];
//                  int deneme2=dizi[i-1][j];
//                  int deneme3=dizi[i-1][j+1];
//                  int deneme4=dizi[i][j-1];
//                  int deneme5=dizi[i][j+1];
//                  int deneme6=dizi[i+1][j-1];
//                  int deneme7=dizi[i+1][j];
//                  int deneme8=dizi[i+1][j+1];
                 
                  

                }

            }

        }
    }
}
