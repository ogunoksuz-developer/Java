
import java.util.Scanner;


public class GameOfLife {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int dizi[][];
		
		System.out.println("Please enter number of cow :");
		int cow = input.nextInt();
        System.out.println("Please enter number of column :");
        int column = input.nextInt();
        dizi = new int [cow][column];
      if (5<=cow && cow<=50){
        	if(5<=column && column <=50){
        	 for(int i =0; i<cow;i++)
        { for(int j=0; j<column; j++)
        	{
        	dizi[i][j] = (int)(Math.random() *4);
        	 
        	
        	System.out.print(dizi[i][j]);
        	 
        	 
        	
        	}
        	System.out.println(""); }}
        	
        	for(int i=0; i<=cow; i++){
        		for (int j =0; i<=column; j++){
        			
        			
        		}
        	}
        	
        	}
      
      else
      System.out.println("Please rerun this program and enter numbers which are from 5 to 50 ");
}
}
